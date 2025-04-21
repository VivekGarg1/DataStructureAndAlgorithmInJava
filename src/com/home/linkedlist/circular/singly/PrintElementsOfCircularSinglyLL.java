package com.home.linkedlist.circular.singly;

public class PrintElementsOfCircularSinglyLL {

    private ListNode<Integer> last;
    private int length;

    public PrintElementsOfCircularSinglyLL() {
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void createCircularSinglyLL(){
        ListNode<Integer> firstNode = new ListNode<>(1);
        ListNode<Integer> secondNode = new ListNode<>(10);
        ListNode<Integer> thirdNode = new ListNode<>(15);
        ListNode<Integer> fourthNode = new ListNode<>(25);
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = firstNode;
        last = fourthNode;
    }

    public void display(){
        if (last == null)
            return;
        ListNode<Integer> first = last.next;
        while(first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data + " ");
    }

    public static void main(String[] args) {
        PrintElementsOfCircularSinglyLL circularSinglyLL = new PrintElementsOfCircularSinglyLL();
        circularSinglyLL.createCircularSinglyLL();
        circularSinglyLL.display();
    }
}
