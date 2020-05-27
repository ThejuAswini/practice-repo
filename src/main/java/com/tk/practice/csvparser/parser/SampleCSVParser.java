package com.tk.practice.csvparser.parser;

import com.tk.practice.csvparser.model.SampleCSVModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SampleCSVParser {

    public List<SampleCSVModel> parser(String filePath) throws IOException {

        List<SampleCSVModel> list = null;
        File csvFile = new File(filePath);

        //check if the file exists
        if (csvFile.isFile()) {

            Boolean ignoreLine = null ;

            //Read data from the file
            FileReader fr = new FileReader(csvFile);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {

                if (list == null) {
                    list = new ArrayList<>();
                    ignoreLine = true;
                }

                if (!ignoreLine) {
                    String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                    list.add(mapSingle(data));
                }

                ignoreLine = false;

            }

        } else {
            throw new FileNotFoundException("File not found");
        }

        return list;
    }

    public SampleCSVModel mapSingle(String[] data) {

        SampleCSVModel sampleCSVModel = new SampleCSVModel();

        sampleCSVModel.setSeriesReference(data[0]);
        sampleCSVModel.setPeriod(data[1]);
        sampleCSVModel.setDescription(data[2]);

        if (data[3] != null) {
            sampleCSVModel.setRevised(Integer.parseInt(data[3]));
        }

        if (data[4] != null) {
            sampleCSVModel.setInitiallyPublished(Integer.parseInt(data[4]));
        }

        return sampleCSVModel;

    }

}
