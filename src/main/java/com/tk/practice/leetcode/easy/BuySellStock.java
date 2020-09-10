package com.tk.practice.leetcode.easy;

public class BuySellStock {

    public static class IndexValue {
        private int index;
        private int value;

        public IndexValue(int index, int value){
            this.index = index;
            this.value =  value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public int maxProfit(int[] prices) {

        int index = 0;
        int value = 0;

        IndexValue minIndexValue = new IndexValue(index, value);
        minIndexValue = getMinPrice(prices);

        IndexValue maxIndexValue = new IndexValue(index, value);
        maxIndexValue = getMaxPrice(prices);

        int minIndex = minIndexValue.getIndex();
        int minPrice = minIndexValue.getValue();

        int maxIndex = maxIndexValue.getIndex();
        int maxPrice = maxIndexValue.getValue();

        if (minIndex < maxIndex){
            return (maxPrice - minPrice);
        }
        else return minIndex;

    }

    public IndexValue getMinPrice(int[] prices){
        int min = prices[0];
        int idx = 0;

        for(int i = 1; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
                idx = i;
            }
        }

        return new IndexValue(idx, min);
    }

    public IndexValue getMaxPrice(int[] prices){
        int max = prices[0];
        int idx = 0;

        for(int i = 1; i < prices.length; i++){
            if(max < prices[i]){
                max = prices[i];
                idx = i;
            }
        }
        return new IndexValue(idx, max);
    }

}
