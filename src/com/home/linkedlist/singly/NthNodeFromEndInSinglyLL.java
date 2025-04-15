package com.home.linkedlist.singly;

public class NthNodeFromEndInSinglyLL {

    private ListNode<Integer> head;

    public void display(){
        ListNode<Integer> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public ListNode<Integer> nThNodeFroEnd(int positionFromEnd){
        if(head == null){
            return null;
        }
        ListNode<Integer> mainPtr = head;
        ListNode<Integer> refPtr = head;
        int count = 0;
        while(count < positionFromEnd){
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr= refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args) {
        NthNodeFromEndInSinglyLL singlyLL = new NthNodeFromEndInSinglyLL();
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
        int nodeFromEnd = 3;
        ListNode<Integer> result = singlyLL.nThNodeFroEnd(nodeFromEnd);
        System.out.println(nodeFromEnd + " Node from end is: " + result.data);
    }
}
