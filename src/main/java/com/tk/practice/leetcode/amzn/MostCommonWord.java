package com.tk.practice.leetcode.amzn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String, Integer> count = new HashMap<>();

        // I can skip counting bad words - I need bad words to check - make it a set
        HashSet<String> bannedWords = new HashSet<>(Arrays.asList(banned));

        String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split(" ");
        // counting all the words except banned words
        for(String word: words){
            if (!bannedWords.contains(word)){
                int value = count.getOrDefault(word, 0) + 1;
                count.put(word, value);
            }
        }

        //looping through hashmap to get the common word
        String result = "";
        for (String key: count.keySet()){
            int val = count.get(key);
            if (result.equals("") || count.get(key) > count.get(result)){
                result = key;
            }
        }

        return result;


    }
}
