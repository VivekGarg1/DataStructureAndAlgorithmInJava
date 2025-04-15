package com.home.linkedlist.singly;

public class DeleteFirstNodeInSinglyLL {

    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void deleteAtFirst(){
        if(head != null){
            ListNode<Integer> temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    public static void main(String[] args) {
        DeleteFirstNodeInSinglyLL singlyLL = new DeleteFirstNodeInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.deleteAtFirst();
        singlyLL.display();
    }
}
