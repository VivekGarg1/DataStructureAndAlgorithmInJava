package com.home.linkedlist.singly;

public class DeleteLastNodeFromSinglyLL {

    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void deleteLast(){
        ListNode<Integer> previousNode = null;
        if(head != null && head.next != null){
            ListNode<Integer> currentNode = head;
            while(currentNode.next != null){
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = null;
        }
        else{
            head = null;
        }
    }

    public static void main(String[] args) {
        DeleteLastNodeFromSinglyLL singlyLL = new DeleteLastNodeFromSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.deleteLast();
        singlyLL.display();
    }
}
