package com.home.stack;

import java.util.EmptyStackException;

public class StackUsingArray {

    private int top;
    private int capacity;
    private int[] arrStack;

    public StackUsingArray(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.arrStack = new int[capacity];
    }

    public void push(int data){
        if(top >= capacity-1)
            throw new StackOverflowError();
        arrStack[++top] = data;
    }

    public int pop() {
        if(top < 0)
            throw new EmptyStackException();
        return arrStack[top--];
    }

    public int peak(){
        if(top < 0)
            throw new EmptyStackException();
        return arrStack[top];
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peak());
        System.out.print("Elements present in stack: ");
        while(!stack.isEmpty()){
            System.out.print(stack.peak() + " ");
            stack.pop();
        }
    }
}
