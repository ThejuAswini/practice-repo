package com.tk.practice.leetcode.amzn.arraysandstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReOrderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        //edge cases
        if (logs.length == 0) {
            return logs;
        }

        String[] reorderedLogs = new String[logs.length];
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log: logs) {
            String[] words = log.split("\\s+");
            if (Character.isDigit(words[1].charAt(0))) {
                digitLogs.add(log);
            }
            else {
                letterLogs.add(log);
            }
        }

        for (int i = 0; i < letterLogs.size(); i++) {

        }
        /*
        List<List<String>> maxAssociatedList = lengthMap.get(maxAssociation);
        Collections.sort(maxAssociatedList, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                int result = 0;
                for (int i = 0; i < o1.size() && result == 0; i++){
                    result = o1.get(i).compareTo(o2.get(i));
                }
                return result;
            }
        });
         */

        int j = 0;
        for (int i = 0; i < logs.length; i++) {
            if (i < letterLogs.size()) {
                reorderedLogs[i] = letterLogs.get(i);
            }
            else {
                reorderedLogs[i] = digitLogs.get(j);
                j++;
            }
        }

        return reorderedLogs;

    }
}
