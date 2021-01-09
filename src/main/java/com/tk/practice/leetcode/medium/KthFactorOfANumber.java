package com.tk.practice.leetcode.medium;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class KthFactorOfANumber {
    public int kthFactor(int n, int k) {
        if (n <= 0) return -1;
        if (k <= 0) return -1;

        Integer[] factors = getFactors(n);
        if (k > factors.length) return -1;
        else {
            return factors[k - 1];
        }

    }

    public Integer[] getFactors(int num) {
        SortedSet<Integer> factors = new TreeSet<>();

        int sqrtN = (int) Math.sqrt(num);
        for (int i = 1; i <= sqrtN; i++) {
            if (num % i == 0) {
                factors.add(i);
                factors.add(num / i);
            }
        }
        return factors.toArray(new Integer[factors.size()]);
    }
}
