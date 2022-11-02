package com.bridgelabz.Queue;

import Node.INode;

public class LinkedListUC {
    public INode head;
    private INode tail;

    public LinkedListUC() {

        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode temporarayNode = this.head;
            this.head = newNode;
            this.head.setNext(temporarayNode);

        }

    }

    public void append (INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode tempINode = this.tail;
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode previousNode, INode newNode) {
        INode temporaryNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(temporaryNode);
    }

    public void insertWithKey(int key, INode newNode) {

        INode nodeWithKeyValue = search(key);
        if(nodeWithKeyValue.getKey().equals(key)) {
            INode temporaryNode = nodeWithKeyValue.getNext();
            nodeWithKeyValue.setNext(newNode);
            newNode.setNext(temporaryNode);
        }
        else {
            System.out.println("Key Node Found");
        }

    }

    public INode deleteFirst() {
        INode temporaryNode = this.head;
        this.head = this.head.getNext();
        return temporaryNode;

    }

    public INode deleteLastNode() {
        INode temporaryNode = head;
        while(!temporaryNode.getNext().equals(tail)) {
            temporaryNode = temporaryNode.getNext();
        }
        this.tail = temporaryNode;
        temporaryNode = temporaryNode.getNext();
        return temporaryNode;
    }

    public INode deleteNodeWithKey(int key) {

        INode nodeWithKeyValue = search(key);

        if(nodeWithKeyValue != null) {

            INode temporaryNode = head;
            while (temporaryNode!=null && temporaryNode.getNext() != nodeWithKeyValue) {
                temporaryNode = temporaryNode.getNext();
            }
            temporaryNode.setNext(nodeWithKeyValue.getNext());
            return nodeWithKeyValue;

        }
        else {
            System.out.println("Key Node Found");
            return null;
        }
    }

    public INode search(int key) {
        INode temporaryNode = head;
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

    public int size() {
        int numberOfNode = 0;
        INode temporaryNode = this.head;
        while(temporaryNode!=null ) {

            temporaryNode = temporaryNode.getNext();
            numberOfNode++;
        }
        return numberOfNode;
    }

    public void printLinkedList () {
        System.out.println("My Nodes: " + head);
    }
}
