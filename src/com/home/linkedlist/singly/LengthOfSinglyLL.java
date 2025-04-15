package com.home.linkedlist.singly;

public class LengthOfSinglyLL {

    private ListNode<Integer> head;

    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public int length(){
        int count =0;
        ListNode currentNode = head;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfSinglyLL singlyLL = new LengthOfSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        System.out.println(singlyLL.length());
    }
}
