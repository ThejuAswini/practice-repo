package com.tk.practice.leetcode.amzn;

import java.util.List;

public class AmazonFreshPromotion {

    public int isWinner(List<List<String>> codeList, List<String> shoppingCart) {

        if (codeList == null || codeList.size() == 0){
            return 1;
        }
        if (shoppingCart == null || shoppingCart.size() == 0) {
            return 0;
        }

        int i = 0, j = 0;

        while (i < codeList.size() && j + codeList.get(i).size() <= shoppingCart.size()) {
            boolean match = true;
            for (int k = 0; k < codeList.get(i).size() ; k++){
                if (!codeList.get(i).get(k).equals("anything") && !shoppingCart.get(j + k).equals(codeList.get(i).get(k))) {
                    match = false;
                    break;
                }
            }
            if (match) {
                j = j + codeList.get(i).size();
                i++;
            }
            else {
                j++;
            }
        }

        return (i == codeList.size()) ? 1 : 0;
    }
}
