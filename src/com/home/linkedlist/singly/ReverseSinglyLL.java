package com.home.linkedlist.singly;

public class ReverseSinglyLL {
    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void reverse(){
        ListNode<Integer> previous = null;
        ListNode<Integer> current = head;
        ListNode<Integer> next = null;
        while(current != null){
           next = current.next;
           current.next = previous;
           previous = current;
           current = next;
        }
        head = previous;
    }

    public static void main(String[] args) {
        ReverseSinglyLL singlyLL = new ReverseSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.reverse();
        singlyLL.display();
    }
}
