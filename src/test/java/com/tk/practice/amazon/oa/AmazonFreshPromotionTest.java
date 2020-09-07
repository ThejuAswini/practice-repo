package com.tk.practice.amazon.oa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AmazonFreshPromotionTest {
    AmazonFreshPromotion testObj = new AmazonFreshPromotion();

    @Test
    void isWinner() {

        //List<String> shoppingCart = Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana");
        //List<List<String>> codeList = Arrays.asList(Arrays.asList("apple", "apple"), Arrays.asList("banana", "anything", "banana"));

        //List<String> shoppingCart = Arrays.asList("banana", "orange", "banana", "apple", "apple");
        List<String> shoppingCart = Arrays.asList("orange", "grapes", "apple", "orange", "orange", "banana", "apple", "banana", "banana");

        List<List<String>> codeList = Arrays.asList(Arrays.asList("anything", "apple" ), Arrays.asList("banana", "anything", "banana"));



        System.out.println(testObj.isWinner(codeList,shoppingCart));

    }
}

