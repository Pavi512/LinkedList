package com.bridgelabz.linkedlist;

//Creating a Node
class Node{
    int data;
    Node next;

    //Constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

//Linked list class to perform operations
class LinkedList{
    //Creating a head node
    Node head;

    //Method to add element at first of the list
    public void addFirst(int element){
        Node newNode = new Node(element);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    //Method to add element at last of the list
    public void addLast(int element){
        Node newNode = new Node(element);
        if(head == null)
            head = newNode;
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    //Method to insert element at given index
    public void addAtIndex(int element,int index) {
        Node newNode = new Node(element);
        if (head == null){
            head = newNode;
        }
        else{
            int count = 1;
            Node curr = head;
            while(count < index){
                curr = curr.next;
                count++;
            }
            newNode.next = curr.next;
            curr.next = newNode;

        }
    }

    //Method to remove the first element and return it.
    public int pop(){
        Node curr = head;
        if(head == null) {
            System.out.println("List is Empty");
            return -1;
        }
        else{
            int data = head.data;
            head = head.next;
            return data;
        }
    }

    //Method to remove the last element
    public int popLast(){
        Node curr = head;
        if(head == null) {
            System.out.println("List is Empty");
            return -1;
        }
        else if (head.next == null) {
            int data = head.data;
            head = null;
            return data;
        }
        else{
            while(curr.next.next != null){
                curr=curr.next;
            }
            int temp = curr.next.data;
            curr.next = null;
            return temp;
        }
    }

    // Method to search an element
    public boolean search(int key) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    //Method to print the list
    public void display(){
        Node curr = head;

        if (head == null) {
            System.out.println("List is empty");
        }
        else{
            while(curr.next != null){
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.print(curr.data);
        }

    }
}

//Main class
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(56);
        ll.addLast(30);
        ll.addLast(70);
        System.out.println(ll.search(30));
//        ll.display();
    }
}
