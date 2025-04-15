package com.home.linkedlist.singly;

public class InsertNodeAtBeginingInSinglyLL {

    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void insertAtBegin(){
        ListNode<Integer> newNode = new ListNode<>(5);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        InsertNodeAtBeginingInSinglyLL singlyLL = new InsertNodeAtBeginingInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.insertAtBegin();
        singlyLL.display();
    }
}
