package com.home.stack;

import java.util.Stack;

public class ReverseAStringUsingStack {

    public String reverse(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c: chars) {
            stack.push(c);
        }
        for(int i = 0; i< str.length() ; i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseAStringUsingStack stack = new ReverseAStringUsingStack();
        String str = "vivek garg";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + stack.reverse(str));
    }
}
