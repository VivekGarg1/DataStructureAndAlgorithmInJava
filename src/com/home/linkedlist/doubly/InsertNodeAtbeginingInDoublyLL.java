package com.home.linkedlist.doubly;
public class InsertNodeAtbeginingInDoublyLL {
    private ListNode<Integer> head;
    private ListNode<Integer> tail;
    private int length;

    public InsertNodeAtbeginingInDoublyLL() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void forwardDisplay(){
        if(head == null)
            return;
        ListNode<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void backwardDisplay(){
        if(tail == null)
            return;
        ListNode<Integer> temp = tail;
        while (temp != null){
            System.out.print(temp.data + "---->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertAtBegining(int data){
        ListNode<Integer> newNode = new ListNode<>(data);
        if(isEmpty())
            tail = newNode;
        else {
            head.previous = newNode;
            newNode.next = head;
        }
        head = newNode;
        length++;
    }

    public static void main(String[] args) {
        InsertNodeAtbeginingInDoublyLL doublyLL = new InsertNodeAtbeginingInDoublyLL();
        doublyLL.insertAtBegining(1);
        System.out.println();
        doublyLL.forwardDisplay();
        System.out.println();
        doublyLL.backwardDisplay();

        ListNode<Integer> secondNode = new ListNode<>(10);
        ListNode<Integer> thirdNode = new ListNode<>(15);
        ListNode<Integer> fourthNode = new ListNode<>(25);
        doublyLL.head.next = secondNode;
        secondNode.previous = doublyLL.head;
        secondNode.next = thirdNode;
        thirdNode.previous = secondNode;
        thirdNode.next = fourthNode;
        fourthNode.previous = thirdNode;
        doublyLL.tail = fourthNode;
        doublyLL.insertAtBegining(5);
        System.out.println();
        doublyLL.forwardDisplay();
        System.out.println();
        doublyLL.backwardDisplay();
    }
}
