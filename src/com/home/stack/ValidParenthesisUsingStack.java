package com.home.stack;

import java.util.Stack;

public class ValidParenthesisUsingStack {

    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') ||
                            (c == ']' && top == '[') ||
                            (c == '}' && top == '{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesisUsingStack stack = new ValidParenthesisUsingStack();
        System.out.println("{()} is valid parenthesis? " + stack.isValid("{()}"));
        System.out.println("{() is valid parenthesis? " + stack.isValid("{()"));
        System.out.println("{] is valid parenthesis? " + stack.isValid("{]"));
        System.out.println("] is valid parenthesis? " + stack.isValid("]"));
        System.out.println("{()[{([])}]} is valid parenthesis? " + stack.isValid("{()[{([])}]}"));
    }
}

