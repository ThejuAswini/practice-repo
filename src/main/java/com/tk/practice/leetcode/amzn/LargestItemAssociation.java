package com.tk.practice.leetcode.amzn;

import java.util.*;

class PairString {
    String first;
    String second;

    public PairString(String first, String second) {
        this.first = first;
        this.second = second;
    }
}

public class LargestItemAssociation {

    public List<String> largestItemAssociation(List<PairString> itemAssociation) {
        List<String> result = new ArrayList<>();

        HashMap<String, List<String>> associatedMap = new HashMap<>();

        // Add all the items and its one direction associates into hashmap
        for (PairString ps: itemAssociation) {
            if (!associatedMap.containsKey(ps.first)){
                associatedMap.put(ps.first, new ArrayList<>());
            }
            associatedMap.get(ps).add(ps.second);
            if (!associatedMap.containsKey(ps.second)){
                associatedMap.put(ps.second, new ArrayList<>());
            }
        }

        //DFS every item to know the depth of each association
        HashMap<Integer, List<List<String>>> lengthMap = new HashMap<>();
        int maxAssociation = Integer.MIN_VALUE;
        for (String key: associatedMap.keySet()) {
            Queue<String> queue = new LinkedList<>();
            TreeSet<String> temp = new TreeSet<>();
            queue.offer(key);
            while(!queue.isEmpty()){
                String head = queue.poll();
                temp.add(head);
                List<String> tail = associatedMap.get(head);
                for (String t: tail){
                    queue.offer(t);
                }
            }
            int size = temp.size();
            maxAssociation = Math.max(maxAssociation, size);
            if (!lengthMap.containsKey(size)){
                lengthMap.put(size, new ArrayList<>());
            }
            lengthMap.get(size).add(new ArrayList<>(temp));
        }

        // Retrieve the maximum size lists and sort them lexiographically
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

        return maxAssociatedList.get(0);

    }

}
