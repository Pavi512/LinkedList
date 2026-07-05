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
        ll.addLast(70
        );
        ll.display();
    }
}
