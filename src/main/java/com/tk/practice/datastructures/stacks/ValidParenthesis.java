package com.tk.practice.datastructures.stacks;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else {
                // Edge conditions such as "})"
                if (stack.size() == 0){
                    return false;
                }
               char t = stack.pop();

                if (c == ')' && t != '('){
                    return false;
                }
                else if (c == '}' && t != '{'){
                    return false;
                }
                else if (c == ']' && t != '['){
                    return false;
                }
            }

        }
        // edge conditions such as "(("
        if (stack.size() != 0){
            return false;
        }
        return true;
    }
}
