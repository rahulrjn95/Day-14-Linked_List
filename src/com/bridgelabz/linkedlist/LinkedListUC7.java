package com.bridgelabz.linkedlist;

public class LinkedListUC7 <E> {

    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);
        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        //Checks whether list is empty
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                //Compares node to be found with each node present in the list
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag) {
            System.out.println();
            System.out.println("Element is present in the list at the position : " + i);
        }
        else
            System.out.println("Element is not present in the list");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List : Node Search Program");

        LinkedListUC7 myList = new LinkedListUC7();

        //Add nodes to the list
        myList.addNode(56);
        myList.addNode(30);
        myList.addNode(70);

        //Search for node 2 in the list
        myList.searchNode(30);

    }
}
