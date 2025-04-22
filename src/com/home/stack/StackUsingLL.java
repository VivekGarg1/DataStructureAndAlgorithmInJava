package com.home.stack;

import java.util.EmptyStackException;

public class StackUsingLL {

    private ListNode<Integer> top;
    private int length;

    public StackUsingLL() {
        this.top = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void display(){
        ListNode<Integer> currentNode = top;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void push(int data){
        ListNode<Integer> newNode = new ListNode<>(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();
        int temp = top.data;
        top = top.next;
        length--;
        return temp;
    }

    public int peak(){
        if(isEmpty())
            throw new EmptyStackException();
        return top.data;
    }

    public static void main(String[] args) {
        StackUsingLL stackUsingLL = new StackUsingLL();
        stackUsingLL.push(15);
        stackUsingLL.push(10);
        stackUsingLL.push(5);
        stackUsingLL.push(1);
        stackUsingLL.display();

        System.out.println("Top element is: " + stackUsingLL.peak());

        stackUsingLL.pop();
        stackUsingLL.display();
        System.out.println("Top element is: " + stackUsingLL.peak());

        stackUsingLL.pop();
        stackUsingLL.display();
        System.out.println("Top element is: " + stackUsingLL.peak());

        stackUsingLL.pop();
        stackUsingLL.display();
        System.out.println("Top element is: " + stackUsingLL.peak());

        stackUsingLL.pop();
        stackUsingLL.display();
        System.out.println("Top element is: " + stackUsingLL.peak());
    }
}
