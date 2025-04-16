package com.home.linkedlist.singly;

public class MergeTwoSortedSinglyLL {

    private ListNode<Integer> head;

    public void display(String ListNumber, ListNode<Integer> list){
        ListNode<Integer> currentNode = list;
        System.out.print(ListNumber);
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public ListNode<Integer> merge(ListNode<Integer> a, ListNode<Integer> b){
        ListNode<Integer> dummy = new ListNode<>(0);
        ListNode<Integer> tail = dummy;
        while(a != null && b != null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }
            else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null)
            tail.next = b;
        else
            tail.next = a;
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedSinglyLL singlyLL = new MergeTwoSortedSinglyLL();
        ListNode<Integer> head1 = new ListNode<>(1);
        ListNode<Integer> secondNode = new ListNode<>(4);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        head1.next = secondNode;
        secondNode.next = thirdNode;
        singlyLL.display("First Sorted List: ", head1);
        System.out.println();

        ListNode<Integer> head2 = new ListNode<>(3);
        ListNode<Integer> secondNode2 = new ListNode<>(6);
        ListNode<Integer> thirdNode2 = new ListNode<>(7);
        head2.next = secondNode2;
        secondNode2.next = thirdNode2;
        singlyLL.display("Second Sorted List : ", head2);
        System.out.println();

        singlyLL.head = singlyLL.merge(head1, head2);
        singlyLL.display("Merged Sorted List: ", singlyLL.head);
    }
}
