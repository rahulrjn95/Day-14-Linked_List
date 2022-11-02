package com.bridgelabz.linkedlist;

public class LinkedListUC3 {
    public static Node head;
    public static Node tail;

    public LinkedListUC3() {

        this.head = null;
        this.tail = null;
    }
    public void append (Node newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            Node tempINode = this.tail;
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }

    public static void main(String[] args) {
        System.out.println("Created Linked List by Append method");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC3 myLinkedList = new LinkedListUC3();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.printLinkedList();
    }
}
