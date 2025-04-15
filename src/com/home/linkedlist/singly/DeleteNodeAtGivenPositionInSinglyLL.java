package com.home.linkedlist.singly;

public class DeleteNodeAtGivenPositionInSinglyLL {
    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void deleteAtGivenPosition(int position){
        if(position == 1){
            head = head.next;
        }
        else {
            ListNode<Integer> previous = head;
            ListNode<Integer> current = head;
            int count = 1;
            while(count < position){
                previous = current;
                current = current.next;
                count++;
            }
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        DeleteNodeAtGivenPositionInSinglyLL singlyLL = new DeleteNodeAtGivenPositionInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        singlyLL.deleteAtGivenPosition(3);
        singlyLL.display();
    }
}
