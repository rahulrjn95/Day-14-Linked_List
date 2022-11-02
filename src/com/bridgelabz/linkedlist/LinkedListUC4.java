package com.bridgelabz.linkedlist;

public class LinkedListUC4 {
    public static Node head;
    public static Node tail;

    public LinkedListUC4() {

        this.head = null;
        this.tail = null;
    }
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
    public Node search(int key) {
        Node tempNode = head;
        boolean flag = false;
        while (tempNode != null && flag == false) {
            if (tempNode.getKey().equals(key)) {
                flag = true;
            } else {

                tempNode = tempNode.getNext();
            }
        }
        if (flag)
            return tempNode;
        else {
            return head;
        }
    }

    public void insertNode(int key, Node newNode) {

        Node previousNode = search(key);
        if (previousNode.getKey().equals(key)) {
            Node temporaryNode = previousNode.getNext();
            previousNode.setNext(newNode);
            newNode.setNext(temporaryNode);
        } else {
            System.out.println("Key Node Found");
        }

    }
    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }

    public static void main(String[] args) {
        System.out.println("Created Linked List by Insert method");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(70);
        MyNode<Integer> nextNode = new MyNode<Integer>(30);
        LinkedListUC4 myLinkedList = new LinkedListUC4();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.printLinkedList();
        int previousNode = 56;
        System.out.println("New node inserted : " + nextNode);
        myLinkedList.insertNode(previousNode, nextNode);
        myLinkedList.printLinkedList();
    }
}
