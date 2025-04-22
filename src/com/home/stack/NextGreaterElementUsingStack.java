package com.home.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementUsingStack {

    public int[] nextGreaterElementTowardsRight(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1; i >= 0 ; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && arr[i] >= stack.peek()){
                    stack.pop();
                }
            }
            if(stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementUsingStack stack = new NextGreaterElementUsingStack();
        System.out.println(Arrays.toString(stack.nextGreaterElementTowardsRight(new int[]{4,7,3,4,8,1})));
    }
}
