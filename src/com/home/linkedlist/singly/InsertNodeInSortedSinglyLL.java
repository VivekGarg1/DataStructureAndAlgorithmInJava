package com.home.linkedlist.singly;

public class InsertNodeInSortedSinglyLL {

    private ListNode<Integer> head;

    public void display(){
        ListNode<Integer> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void insert(int data){
        ListNode<Integer> current = head;
        ListNode<Integer> newNode = new ListNode<>(data);
        ListNode<Integer> temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        InsertNodeInSortedSinglyLL singlyLL = new InsertNodeInSortedSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(8);
        ListNode<Integer> thirdNode = new ListNode<>(10);
        ListNode<Integer> fourthNode = new ListNode<>(16);
        ListNode<Integer> fifthNode = new ListNode<>(21);
        singlyLL.head = new ListNode<>(1);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.insert(9);
        singlyLL.insert(13);
        singlyLL.insert(23);
        singlyLL.display();
    }
}
