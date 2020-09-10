package com.tk.practice.leetcode.medium;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: nums){
            int value = hashMap.getOrDefault(i, 0) + 1;
            hashMap.put(i, value);
        }

        /*
        Sorting values - takes O(logn)
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hashMap.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        List<Integer> result = new ArrayList<Integer>();

        for (int i = list.size() -1; i >= list.size() - k; i--){

            result.add(list.get(i).getKey());

        }

        int[] array = result.stream().mapToInt(j -> j).toArray();

        return array;
         */

        // using bucket sort to sort the values in O(n)

        int max_frequency = Collections.max(hashMap.values());

        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i <= max_frequency; i++){
            buckets.add(new ArrayList<>());
        }

        for(Integer key: hashMap.keySet()){
            int freq = hashMap.get(key);
            if (buckets.get(freq) == null){
                buckets.add(freq, new ArrayList<>());
            }
            buckets.get(freq).add(key);
        }

        List<Integer> result = new ArrayList<Integer>();

        for (int i = buckets.size() - 1; i >= 1; i--){
            if (!buckets.isEmpty()){
                for(Integer j: buckets.get(i)){
                    result.add(j);
                }

                if (result.size() == k) return result.stream().mapToInt(j -> j).toArray();
            }
        }

        return null;

    }
}
