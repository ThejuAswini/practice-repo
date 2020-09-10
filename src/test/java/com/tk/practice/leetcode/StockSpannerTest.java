package com.tk.practice.leetcode;

import com.tk.practice.leetcode.medium.StockSpanner;
import org.junit.jupiter.api.Test;

class StockSpannerTest {

    StockSpanner S = new StockSpanner();


    @Test
    void next() {
        System.out.println(S.next(100));
        System.out.println(S.next(80));
        System.out.println(S.next(60));
        System.out.println(S.next(70));
        int i = S.next(60);
        System.out.println(i);
        System.out.println(S.next(75));
        System.out.println(S.next(85));
    }
}