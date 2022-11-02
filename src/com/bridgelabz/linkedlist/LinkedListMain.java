package com.bridgelabz.linkedlist;

import Node.INode;
import Node.MyNode;

public class LinkedListMain {
    public static void main(String[] args) {

        System.out.println("----- Welcome to Data Structure: Linked List -----");

        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        MyNode<Integer> nodeToBeInserted = new MyNode<Integer>(40);
        int valueOfPreviousNode = 70;
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(firstNode, secondNode);
        myLinkedList.insertWithKey(valueOfPreviousNode, nodeToBeInserted);
        System.out.println("The inserted key value is:"+nodeToBeInserted.getKey());
        INode deletedNode = myLinkedList.deleteNodeWithKey(40);
        System.out.println("The deleted key value is:"+deletedNode.getKey());
        int listSize = myLinkedList.size();
        myLinkedList.printLinkedList();
        System.out.println("The size of the linked list is : "+listSize);
    }
}
