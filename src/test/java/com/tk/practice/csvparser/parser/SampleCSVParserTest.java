package com.tk.practice.csvparser.parser;

import com.tk.practice.csvparser.model.SampleCSVModel;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SampleCSVParserTest {

    @Test
    void parser() throws IOException {
        SampleCSVParser testObj = new SampleCSVParser();

        List<SampleCSVModel> listObj = testObj.parser("sample/sample1.csv");

        for(SampleCSVModel model: listObj){
            System.out.println(model.toString());
        }

    }
}