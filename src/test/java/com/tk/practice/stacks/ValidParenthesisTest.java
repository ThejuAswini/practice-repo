package com.tk.practice.stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesisTest {

    @Test
    void isValid() {
        ValidParenthesis testObj = new ValidParenthesis();

        Assertions.assertTrue(testObj.isValid("()"));
        Assertions.assertTrue(testObj.isValid("()[]{}"));
        Assertions.assertFalse(testObj.isValid("(]"));
        Assertions.assertFalse(testObj.isValid("([)]"));
        Assertions.assertTrue(testObj.isValid("{()}"));

        Assertions.assertFalse(testObj.isValid("(("));
        Assertions.assertFalse(testObj.isValid("){"));
    }
}