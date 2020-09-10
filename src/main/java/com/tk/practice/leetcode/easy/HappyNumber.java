

/* 202. Happy Number
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.
 */

/* A number will not be a Happy Number when it makes a loop in its sequence that is it touches a number in sequence which already been touched.
So to check whether a number is happy or not, we can keep a set, if the same number occurs again we flag result as not happy.*/

package com.tk.practice.leetcode.easy;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    Set<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {

        set.add(n);
        if (n < 1){
            return false;
        }
        else if (n == 1){
            return true;
        }
        else {
            int sum = 0;
            while(n>0){
                int rem = n % 10;
                sum = sum + (rem * rem);
                n = n / 10;
            }

            if (set.contains(sum)){
                return false;
            }
            else return isHappy(sum);
        }

    }
}

