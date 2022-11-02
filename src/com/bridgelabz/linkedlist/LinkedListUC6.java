package com.bridgelabz.linkedlist;

public class LinkedListUC6 {
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

    public Node popLast(Node head) {
        if (this.head == null)
            return null;

        if (head.getNext() == null) {
            return null;
        }
        // Find the second last node
        Node tempNode = head;
        while (tempNode.getNext().getNext() != null)
            tempNode = tempNode.getNext();

        // Change next of second last
        tempNode.setNext(null);
        return head;

    }


    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }


    public static void main(String[] args) {
        System.out.println("Created Linked list by add method");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC6 myLinkedList = new LinkedListUC6();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.popLast(firstNode);
        myLinkedList.printLinkedList();
    }
}
