package com.tk.practice.leetcode.easy;

public class TwoNumGCD {

    //this is iteration using euclidian algorithm
    public int twoNumGCD(int a, int b){
        int gcd = 1;
        int small;
        int large;
        int remainder = 0;
        
        if (a == b) return a;
        if (a == 0 || b == 0) return 0;
        if (a == 1 || b == 1) return 1;
        
        if (a > b) {
            large = a;
            small = b;
        }
        else {
            large = b;
            small = a;
        }
        
        while (large % small != 0){
            remainder = large % small;
            large = small;
            small = remainder;
        }
        
        return remainder;
    }

    //Using iteration gcd (a, b) = gcd (a, a%b) - assuming a < b

    public int twoNumberGCDRecursive(int a, int b){
        if (b == 0) return a;

        return twoNumberGCDRecursive(b, a % b);
    }

}
