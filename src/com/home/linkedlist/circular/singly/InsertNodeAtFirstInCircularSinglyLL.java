package com.home.linkedlist.circular.singly;

public class InsertNodeAtFirstInCircularSinglyLL {

    private ListNode<Integer> last;
    private int length;

    public InsertNodeAtFirstInCircularSinglyLL() {
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertAtFirst(int data){
        ListNode<Integer> newNode = new ListNode<>(data);
        if (last == null)
            last = newNode;
        else
            newNode.next = last.next;
        last.next = newNode;
        length++;
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
        InsertNodeAtFirstInCircularSinglyLL circularSinglyLL = new InsertNodeAtFirstInCircularSinglyLL();
        circularSinglyLL.insertAtFirst(1);
        circularSinglyLL.display();

        circularSinglyLL.insertAtFirst(5);
        circularSinglyLL.display();

        circularSinglyLL.insertAtFirst(10);
        circularSinglyLL.display();

        circularSinglyLL.insertAtFirst(15);
        circularSinglyLL.display();
    }
}
