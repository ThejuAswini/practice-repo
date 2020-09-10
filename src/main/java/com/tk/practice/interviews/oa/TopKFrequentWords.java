package com.tk.practice.interviews.oa;

import java.util.*;

public class TopKFrequentWords {

    //time complexity is O(MN) for two loops and O(NlogN) for the sorting..So, overall TC: O(MN)

    public String[] getKFrequentKeywords(String[] reviews, String[] keywords, int k) {

        List<String> keywordsList = Arrays.asList(keywords);
        HashMap<String, Integer> count = new HashMap<>();

        //looping through reviews to count the keywords
        for (String review : reviews) {
            //since the comparision is case-insensitive
            review = review.replaceAll("[^a-zA-Z ]", " ").toLowerCase();

            //we need set to remove duplicates while looking for keywords as 'multiple occurrences be considered as single mention'
            Set<String> encounteredWords = new HashSet<>();

            //loop through each review
            for (final String word : review.split(" ")) {
                // if the selected word is in the keywords list and is not already there in the encountered words set,
                // we will add it to the hashmap to count the frequency of the word
                if (keywordsList.contains(word) && !encounteredWords.contains(word)) {
                    int val = count.getOrDefault(word, 0) + 1;
                    count.put(word, val);
                    encounteredWords.add(word);
                }
            }
        }

        System.out.println(count);

        String[] result = count.keySet().toArray(new String[count.size()]);
        System.out.println(Arrays.toString(result));
        //sorting the keywords
        Arrays.sort(result, (a, b) -> count.get(a).equals(count.get(b)) ? a.compareTo(b) : count.get(b) - count.get(a));
        System.out.println(Arrays.toString(result));

        return Arrays.copyOfRange(result, 0, k);
    }


}
