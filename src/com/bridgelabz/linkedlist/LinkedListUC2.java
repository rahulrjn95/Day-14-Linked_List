package com.bridgelabz.linkedlist;

public class LinkedListUC2 {
    public static Node head;
    public static Node tail;
    public LinkedListUC2() {
        this.head = head;
        this.tail = tail;
    }
    public void add(Node newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }

    public static void main(String[] args) {
        System.out.println("Created Linked list by add method");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        LinkedListUC2 myLinkedList = new LinkedListUC2();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.printLinkedList();
    }
}
