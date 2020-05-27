package com.tk.practice.medium;

import java.util.*;

public class SortCharactersByFreq {
    public String frequencySort(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c: s.toCharArray()){
            int value = hashMap.getOrDefault(c, 0) + 1;
            hashMap.put(c, value);
        }

        List<Map.Entry<Character, Integer>> list = new LinkedList<>(hashMap.entrySet());

        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        StringBuilder result = new StringBuilder();

        for (int i = list.size() - 1; i >= 0; i--){
            for(int j = 0; j < list.get(i).getValue(); j++){
                result.append(list.get(i).getKey());
            }

        }

        return result.toString();

    }

    public void sum(){

    }




}
