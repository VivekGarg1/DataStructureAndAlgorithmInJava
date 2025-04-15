package com.home.linkedlist.singly;

public class InsertNodeAtGivenPositionInSinglyLL {

    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void insertAtGivenPosition(int position, int data){
        ListNode<Integer> newNode = new ListNode<>(data);
        if (position == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode<Integer> previousNode = head;
            int count = 1;
            while(count < position-1){
                previousNode = previousNode.next;
                count++;
            }
            ListNode<Integer> nextNode = previousNode.next;
            newNode.next = nextNode;
            previousNode.next = newNode;
        }
    }

    public static void main(String[] args) {
        InsertNodeAtGivenPositionInSinglyLL singlyLL = new InsertNodeAtGivenPositionInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.insertAtGivenPosition(3,7);
        singlyLL.display();
    }
}
