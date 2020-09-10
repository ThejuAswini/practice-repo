package com.tk.practice.interviews.oa;

import java.util.List;

/*
       List<List<String>> list = new ArrayList<List<String>>();
   Arrays.sort(products);
   char[] wordArray = searchWord.toCharArray();
   StringBuilder wordBuilder = new StringBuilder();
   int subStringCounter = 1;
   for (char c : wordArray){
       List<String> subList = new ArrayList<String>();
       wordBuilder.append(c);
       for(int i = 0; i < products.length; i++){
           if(products[i].length() >= subStringCounter){
               String subString = products[i].substring(0,subStringCounter);
               if(subString.contains(wordBuilder.toString())){
                   subList.add(products[i]);
               }
           }
           if(subList.size() == 3){
               break;
           }
       }
       subStringCounter += 1;
       list.add(subList);
   }
   return list;
        */

public class ProductSuggestions {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

      return null;

    }
}
