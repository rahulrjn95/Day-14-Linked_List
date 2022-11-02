package com.bridgelabz.linkedlist;

public class LinkedListUC5 {
    public static Node head;

    public void append(Node newNode) {
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = this.head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
    }

    public Node popFirst(Node head) {
        Node tempNode=this.head;
        this.head=head.getNext();
        return tempNode;
    }



    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }


    public static void main(String[] args) {
        System.out.println("Created Linked list by add method");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC5 myLinkedList = new LinkedListUC5();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.popFirst(firstNode);
        myLinkedList.printLinkedList();
    }
}
