package com.home.linkedlist.circular.singly;

public class InsertNodeAtLastInCircularSinglyLL {

    private ListNode<Integer> last;
    private int length;

    public InsertNodeAtLastInCircularSinglyLL() {
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertAtLast(int data){
        ListNode<Integer> newNode = new ListNode<>(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        }
        else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
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
        InsertNodeAtLastInCircularSinglyLL circularSinglyLL = new InsertNodeAtLastInCircularSinglyLL();
        circularSinglyLL.insertAtLast(1);
        circularSinglyLL.display();

        circularSinglyLL.insertAtLast(5);
        circularSinglyLL.display();

        circularSinglyLL.insertAtLast(10);
        circularSinglyLL.display();

        circularSinglyLL.insertAtLast(15);
        circularSinglyLL.display();
    }
}
