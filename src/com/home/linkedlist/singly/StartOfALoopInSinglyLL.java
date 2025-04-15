package com.home.linkedlist.singly;

public class StartOfALoopInSinglyLL {

    private ListNode<Integer> head;

    public void detectFirstNodeOfLoop(){
        ListNode<Integer> slowPtr = head;
        ListNode<Integer> fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                System.out.println("is loop exists? Yes");
                ListNode<Integer> startNode = getStartingNode(slowPtr);
                System.out.println("Loop Start Node is: " + startNode.data);
                return;
            }
        }
        System.out.println("is loop exists? No");
    }

    private ListNode<Integer> getStartingNode(ListNode<Integer> slowPtr) {
        ListNode<Integer> temp = head;
        while (slowPtr != temp){
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        StartOfALoopInSinglyLL singlyLL = new StartOfALoopInSinglyLL();
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
        sixthNode.next = thirdNode;
        singlyLL.detectFirstNodeOfLoop();
    }
}
