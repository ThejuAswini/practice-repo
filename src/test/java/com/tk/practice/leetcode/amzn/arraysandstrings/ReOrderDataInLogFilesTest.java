package com.tk.practice.leetcode.amzn.arraysandstrings;

import org.junit.jupiter.api.Test;

class ReOrderDataInLogFilesTest {
    ReOrderDataInLogFiles testObj = new ReOrderDataInLogFiles();

    @Test
    void reorderLogFiles() {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println(testObj.reorderLogFiles(logs));
    }
}