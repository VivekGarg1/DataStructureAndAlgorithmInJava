package com.home.linkedlist.circular.singly;

import java.util.NoSuchElementException;

public class RemoveLastNodeInCircularSinglyLL {

    private ListNode<Integer> last;
    private int length;

    public RemoveLastNodeInCircularSinglyLL() {
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
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

    public void insertAtFirst(int data){
        ListNode<Integer> newNode = new ListNode<>(data);
        if (last == null)
            last = newNode;
        else
            newNode.next = last.next;
        last.next = newNode;
        length++;
    }

    public ListNode<Integer> removeAtLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        ListNode<Integer> first = last.next;
        ListNode<Integer> temp = null;
        if (last.next == last) {
            temp = last;
            last = null;
        }
        else {
            while (first.next != last){
                first = first.next;
            }
            temp = last;
            last = first;
            last.next = first.next.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        RemoveLastNodeInCircularSinglyLL circularSinglyLL = new RemoveLastNodeInCircularSinglyLL();
        circularSinglyLL.insertAtFirst(1);
        circularSinglyLL.display();

        circularSinglyLL.insertAtFirst(5);
        circularSinglyLL.display();

        circularSinglyLL.insertAtFirst(10);
        circularSinglyLL.display();

        circularSinglyLL.insertAtFirst(15);
        circularSinglyLL.display();

        System.out.println(circularSinglyLL.removeAtLast().data);
        circularSinglyLL.display();

        System.out.println(circularSinglyLL.removeAtLast().data);
        circularSinglyLL.display();

        System.out.println(circularSinglyLL.removeAtLast().data);
        circularSinglyLL.display();

        System.out.println(circularSinglyLL.removeAtLast().data);
        circularSinglyLL.display();

        System.out.println(circularSinglyLL.removeAtLast().data);
        circularSinglyLL.display();
    }
}
