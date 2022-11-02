package com.bridgelabz.linkedlist;

public class LinkedListUC8 {
    private Node head;
    private Node tail;

    public LinkedListUC8() {

        this.head = null;
        this.tail = null;
    }

    public void add(Node newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            Node temporarayNode = this.head;
            this.head = newNode;
            this.head.setNext(temporarayNode);

        }

    }
    public void insertWithKey(int key, Node newNode) {

        Node nodeWithKeyValue = search(key);
        if(nodeWithKeyValue.getKey().equals(key)) {
            Node temporaryNode = nodeWithKeyValue.getNext();
            nodeWithKeyValue.setNext(newNode);
            newNode.setNext(temporaryNode);
        }
        else {
            System.out.println("Key Node Found");
        }

    }
    public Node search(int key) {
        Node temporaryNode = head;
        boolean isFound = false;
        while (temporaryNode != null  && isFound == false) {
            if(temporaryNode.getKey().equals(key)) {
                isFound = true;
            }
            else {

                temporaryNode = temporaryNode.getNext();
            }
        }
        if(isFound)
            return temporaryNode;
        else {
            return head;
        }
    }
    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List : Insert Node with key value Program");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        MyNode<Integer> nodeToBeInserted = new MyNode<Integer>(40);
        int valueOfPreviousNode = 30;
        LinkedListUC8 myLinkedList = new LinkedListUC8();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);

        System.out.println("After insertion with key the Linked List contains: ");
        myLinkedList.insertWithKey(valueOfPreviousNode, nodeToBeInserted);
        myLinkedList.printLinkedList();

    }
}
