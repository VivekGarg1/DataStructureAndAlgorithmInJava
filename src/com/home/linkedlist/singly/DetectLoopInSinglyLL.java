package com.home.linkedlist.singly;

public class DetectLoopInSinglyLL {

    private ListNode<Integer> head;

    public boolean detectLoop(){
        ListNode<Integer> slowPtr = head;
        ListNode<Integer> fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoopInSinglyLL singlyLL = new DetectLoopInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(12);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        ListNode<Integer> fifthNode = new ListNode<>(3);
        ListNode<Integer> sixthNode = new ListNode<>(17);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        sixthNode.next = secondNode;
        System.out.println("is loop exists? " + singlyLL.detectLoop());
    }
}
