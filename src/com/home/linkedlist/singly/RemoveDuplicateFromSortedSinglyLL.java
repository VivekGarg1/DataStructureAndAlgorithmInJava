package com.home.linkedlist.singly;

public class RemoveDuplicateFromSortedSinglyLL {

    private ListNode<Integer> head;

    public void display(){
        ListNode<Integer> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void removeDuplicate(){
        ListNode<Integer> current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedSinglyLL singlyLL = new RemoveDuplicateFromSortedSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(2);
        ListNode<Integer> fourthNode = new ListNode<>(3);
        ListNode<Integer> fifthNode = new ListNode<>(3);
        singlyLL.head = new ListNode<>(1);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.removeDuplicate();
        singlyLL.display();
    }
}
