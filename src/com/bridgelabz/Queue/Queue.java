package com.bridgelabz.Queue;

import LinkedList.LinkedList;
import Node.INode;

public class Queue<K> {
    private final LinkedList queueLinkedList;

    public Queue() {
        queueLinkedList = new LinkedList();
    }
    public void enqueue(INode element) {
        queueLinkedList.append(element);
    }
    public void printQueue() {
        queueLinkedList.printLinkedList();
    }
}
