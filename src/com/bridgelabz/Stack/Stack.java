package com.bridgelabz.Stack;

import LinkedList.LinkedList;
import Node.INode;

public class Stack {
    private final LinkedList stackLinkedList;

    public Stack() {
        stackLinkedList = new LinkedList();
    }


    public void push(INode element) {
        stackLinkedList.add(element);
    }
    public void printStack() {
        stackLinkedList.printLinkedList();
    }
}
