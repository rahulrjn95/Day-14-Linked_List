package com.bridgelabz.linkedlist;

public class LinkedListUC9 {
    private Node head;

    public LinkedListUC9() {

        this.head = null;
    }
    public void add(Node newNode) {
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
    public Node deleteNodeWithKey(int key) {

        Node nodeWithKeyValue = search(key);

        if(nodeWithKeyValue != null) {

            Node temporaryNode = head;
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
    public int size() {
        int numberOfNode = 0;
        Node temporaryNode = this.head;
        while(temporaryNode!=null ) {

            temporaryNode = temporaryNode.getNext();
            numberOfNode++;
        }
        return numberOfNode;
    }
    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List : Delete Node with key value Program");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        MyNode<Integer> nodeToBeInserted = new MyNode<Integer>(40);
        int valueOfPreviousNode = 30;
        LinkedListUC9 myLinkedList = new LinkedListUC9();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        System.out.println("Before deletion method the Linked List contains: ");
        myLinkedList.insertWithKey(valueOfPreviousNode, nodeToBeInserted);
        myLinkedList.printLinkedList();
        System.out.println("After deletion with key, the Linked List contains: ");
        Node deletedNode = myLinkedList.deleteNodeWithKey(40);
        System.out.println("The deleted key value is:"+deletedNode.getKey());
        myLinkedList.printLinkedList();

        int listSize = myLinkedList.size();
        System.out.println("The size of the linked list is : "+listSize);
    }
}
