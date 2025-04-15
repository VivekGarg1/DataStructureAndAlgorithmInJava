package com.home.linkedlist.singly;

public class SearchAnElementInSinglyLL {
    private ListNode<Integer> head;
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ----> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public boolean search(int searchKey){
        ListNode<Integer> current = head;
        while(current != null){
            if(current.data == searchKey)
                return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchAnElementInSinglyLL singlyLL = new SearchAnElementInSinglyLL();
        ListNode<Integer> secondNode = new ListNode<>(1);
        ListNode<Integer> thirdNode = new ListNode<>(8);
        ListNode<Integer> fourthNode = new ListNode<>(11);
        singlyLL.head = new ListNode<>(10);
        singlyLL.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        singlyLL.display();
        System.out.println();
        int searchKey = 8;
        boolean isPresent = singlyLL.search(searchKey);
        if(isPresent)
            System.out.println(searchKey + " is present in given List");
        else
            System.out.println(searchKey + " is not present in given List");
    }
}
