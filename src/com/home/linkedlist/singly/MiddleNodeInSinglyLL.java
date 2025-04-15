package com.home.linkedlist.singly;

public class MiddleNodeInSinglyLL {

    private ListNode<Integer> head;

    public void display(){
        ListNode<Integer> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public ListNode<Integer> middle(){
        ListNode<Integer> slowPtr = head;
        ListNode<Integer> fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        MiddleNodeInSinglyLL singlyLL = new MiddleNodeInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(12);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        ListNode<Integer> fifthNode = new ListNode<>(3);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        singlyLL.display();
        System.out.println();
        ListNode<Integer> middleNode = singlyLL.middle();
        System.out.println("Middle Node id: " + middleNode.data);
    }
}
