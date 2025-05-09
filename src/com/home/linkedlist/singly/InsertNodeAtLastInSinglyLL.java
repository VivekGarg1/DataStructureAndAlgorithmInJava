package com.home.linkedlist.singly;

public class InsertNodeAtLastInSinglyLL {

    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void insertAtLast(){
        ListNode<Integer> newNode = new ListNode<>(5);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode<Integer> currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public static void main(String[] args) {
        InsertNodeAtLastInSinglyLL singlyLL = new InsertNodeAtLastInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.insertAtLast();
        singlyLL.display();
    }
}
