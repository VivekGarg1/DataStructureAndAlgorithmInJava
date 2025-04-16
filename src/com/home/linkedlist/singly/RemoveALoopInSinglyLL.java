package com.home.linkedlist.singly;

public class RemoveALoopInSinglyLL {

    private ListNode<Integer> head;

    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void detectFirstNodeOfLoop(){
        ListNode<Integer> slowPtr = head;
        ListNode<Integer> fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                System.out.println("is loop exists? Yes !! Now going to remove the loop");
                removeLoop(slowPtr);
                return;
            }
        }
        System.out.println("is loop exists? No");
    }

    private void removeLoop(ListNode<Integer> slowPtr) {
        ListNode<Integer> temp = head;
        while (slowPtr.next != temp.next){
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        slowPtr.next = null;
    }

    public static void main(String[] args) {
        RemoveALoopInSinglyLL singlyLL = new RemoveALoopInSinglyLL();
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
        singlyLL.display();
    }
}
