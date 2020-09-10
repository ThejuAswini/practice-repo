package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuySellStockTest {

    BuySellStock testObj = new BuySellStock();
    int[] prices = {7,1,5,3,6,4};

    @Test
    void maxProfit() {
        Assertions.assertEquals(10, testObj.maxProfit(prices));
    }

    @Test
    void getMinPrice() {
        Assertions.assertEquals(0, testObj.getMinPrice(prices));
    }

    @Test
    void getMaxPrice() {
        Assertions.assertEquals(10, testObj.getMaxPrice(prices));
    }
}