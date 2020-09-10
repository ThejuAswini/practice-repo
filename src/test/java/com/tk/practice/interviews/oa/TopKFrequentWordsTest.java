package com.tk.practice.interviews.oa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TopKFrequentWordsTest {

    TopKFrequentWords testObj = new TopKFrequentWords();

    @Test
    void getKFrequentKeywords() {

        int k = 2;
        String[] keywords = {"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
        String[] reviews = {
                "I love anacell Best services; Best services provided by anacell",
                "betacellular has great services",
                "deltacellular provides much better services than betacellular",
                "cetracular is worse than anacell",
                "Betacellular is better than deltacellular.",
        };

        System.out.println(Arrays.toString(testObj.getKFrequentKeywords(reviews, keywords, k)));


    }
}