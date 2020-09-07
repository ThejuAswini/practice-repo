package com.tk.practice.amazon.oa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OptimalUtilizationTest {
    OptimalUtilization testObj = new OptimalUtilization();

    @Test
    void getPairs() {
        List<int[]> a = new ArrayList<>();
        a.add( new int[]{1, 3});
        a.add( new int[]{2, 5});
        a.add( new int[]{3, 7});
        a.add( new int[]{4, 10});

        List<int[]> b = new ArrayList<>();
        b.add( new int[]{1, 2});
        b.add( new int[]{2, 3});
        b.add( new int[]{3, 4});
        b.add( new int[]{4, 5});

        List<int[]> result = testObj.getPairs(a, b, 10);

        for (int[] x: result){
            System.out.println(Arrays.toString(x));
        }


    }
}