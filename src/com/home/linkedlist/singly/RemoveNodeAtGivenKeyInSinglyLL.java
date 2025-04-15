package com.home.linkedlist.singly;

public class RemoveNodeAtGivenKeyInSinglyLL {
    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void removeAtGivenKey(int key){
        if(head.data == key){
            head = head.next;
        }
        else {
            ListNode<Integer> current = head;
            ListNode<Integer> temp = null;
            while (current != null && current.data != key) {
                temp = current;
                current = current.next;
            }
            temp.next = current.next;
        }
    }

    public static void main(String[] args) {
        RemoveNodeAtGivenKeyInSinglyLL singlyLL = new RemoveNodeAtGivenKeyInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.removeAtGivenKey(1);
        singlyLL.display();
    }
}
