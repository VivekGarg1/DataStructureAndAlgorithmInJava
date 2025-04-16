package com.home.linkedlist.singly;

public class AddTwoSortedSinglyLL {

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

    public ListNode<Integer> add(ListNode<Integer> a, ListNode<Integer> b){
        ListNode<Integer> dummy = new ListNode<>(0);
        ListNode<Integer> tail = dummy;
        int carry = 0;
        while(a != null || b != null) {
            int x = a != null ? a.data : 0;
            int y = b != null ? b.data : 0;
            int sum = carry + x + y;
            carry = sum/10;
            tail.next = new ListNode<>(sum % 10);
            tail = tail.next;
            if(a != null)
                a = a.next;
            if(b != null)
                b = b.next;
        }
        if(carry > 0)
            tail.next = new ListNode<>(carry);
        return dummy.next;
    }

    public static void main(String[] args) {
        //947 + 65 = 1012 // All things would be in reverse order including result as well
        AddTwoSortedSinglyLL singlyLL = new AddTwoSortedSinglyLL();
        ListNode<Integer> head1 = new ListNode<>(7);
        ListNode<Integer> secondNode = new ListNode<>(4);
        ListNode<Integer> thirdNode = new ListNode<>(9);
        head1.next = secondNode;
        secondNode.next = thirdNode;
        singlyLL.display("First Reversed List: ", head1);
        System.out.println();

        ListNode<Integer> head2 = new ListNode<>(5);
        ListNode<Integer> secondNode2 = new ListNode<>(6);
        head2.next = secondNode2;
        singlyLL.display("Second reversed List : ", head2);
        System.out.println();

        singlyLL.head = singlyLL.add(head1, head2);
        singlyLL.display("Added result in reversed order: ", singlyLL.head);
    }
}
