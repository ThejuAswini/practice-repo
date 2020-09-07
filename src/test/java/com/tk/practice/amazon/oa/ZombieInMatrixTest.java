package com.tk.practice.amazon.oa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZombieInMatrixTest {
    ZombieInMatrix testObj = new ZombieInMatrix();

    @Test
    void minHours() {

        /*
        Integer[] row1 = {0,1,1,0,1};
        Integer[] row2 = {0,1,0,1,0};
        Integer[] row3 = {0,0,0,0,1};
        Integer[] row4 = {0,1,0,0,0};

        List<Integer> ls1, ls2, ls3, ls4;
        ls1 = Arrays.asList(row1);
        ls2 = Arrays.asList(row2);
        ls3 = Arrays.asList(row3);
        ls4 = Arrays.asList(row4);

        List<List<Integer>> grid = new ArrayList<>();
        grid.add(ls1);
        grid.add(ls2);
        grid.add(ls3);
        grid.add(ls4);
         */

        List<List<Integer>> grid = new ArrayList<>();

        System.out.println(testObj.minHours(0, 0, grid));

    }
}