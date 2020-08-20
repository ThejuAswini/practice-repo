package com.tk.practice.amazon.oa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCommonWordTest {
    MostCommonWord testObj = new MostCommonWord();

    @Test
    void mostCommonWord() {
        //String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        //String[] banned = {"hit"};

        String paragraph = "Bob. hIt, baLl";
        String[] banned = {"bob", "hit"};

        //String paragraph = "a, a, a, a, b,b,b,c, c";
        //String[] banned = {"a"};

        System.out.println(testObj.mostCommonWord(paragraph, banned));
    }

}
