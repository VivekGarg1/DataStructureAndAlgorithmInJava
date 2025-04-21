package com.home.linkedlist.circular.doubly;

public class ListNode<T> {
    T data;
    ListNode<T> next;
    ListNode<T> previous;

    public ListNode(T data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
