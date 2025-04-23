package com.home.queue;

import java.util.NoSuchElementException;

public class ImplementationOfQueue<T> {

    private ListNode<T> front;
    private ListNode<T> rear;
    private int length;

    public ImplementationOfQueue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void display(){
        if(isEmpty())
            return;
        ListNode<T> currentNode = front;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void enqueue(T data){
        ListNode<T> newNode = new ListNode<>(data);
        if(isEmpty()){
            front = newNode;
        }
        else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public T dequeue(){
        if(isEmpty())
            throw new NoSuchElementException();
        T temp = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        length--;
        return temp;
    }

    public T first(){
        if(isEmpty())
            throw new NoSuchElementException("Queue is already empty");
        return front.data;
    }

    public T last(){
        if(isEmpty())
            throw new NoSuchElementException("Queue is already empty");
        return rear.data;
    }

    public static void main(String[] args) {
        ImplementationOfQueue<Integer> queue = new ImplementationOfQueue<>();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.display();
        System.out.println("First and last Element is: " + queue.first() + "," + queue.last());

        System.out.println(queue.dequeue());
        queue.display();
        System.out.println("First and last Element is: " + queue.first() + "," + queue.last());

        System.out.println(queue.dequeue());
        queue.display();
        System.out.println("First and last Element is: " + queue.first() + "," + queue.last());

        System.out.println(queue.dequeue());
        queue.display();
        System.out.println("First and last Element is: " + queue.first() + "," + queue.last());

        System.out.println(queue.dequeue());
        queue.display();
        System.out.println("First and last Element is: " + queue.first() + "," + queue.last());
    }
}
