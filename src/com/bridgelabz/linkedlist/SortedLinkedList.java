package com.bridgelabz.linkedlist;

//Generic Sorted Linked List class
public class SortedLinkedList<T extends Comparable<T>> {
    Node head;

    //Node class
    class Node {
        T data;
        Node next;

        //Constructor
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //Method to add elements in sorted order
    public void add(T data) {
        Node newNode = new Node(data);

        // Case 1: Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        // Case 2: Insert before head
        if (data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 3: Find correct position
        Node curr = head;
        while (curr.next != null &&
                curr.next.data.compareTo(data) < 0) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    //Method to print list
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }

        System.out.println();
    }

    //Main method
    public static void main(String[] args) {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.display();
    }
}
