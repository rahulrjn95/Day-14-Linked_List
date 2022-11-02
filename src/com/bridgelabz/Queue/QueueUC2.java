package com.bridgelabz.Queue;

import Node.INode;

public class QueueUC2 <K>{
    private final LinkedListUC queueLinkedList;

    public QueueUC2() {
        queueLinkedList = new LinkedListUC();
    }
    public void enqueue(INode element) {
        queueLinkedList.append(element);
    }
    public void printQueue() {
        queueLinkedList.printLinkedList();
    }

    public INode dequeue() {
        return queueLinkedList.deleteFirst();
    }


    public boolean isEmpty() {
        if(queueLinkedList.head != null) {
            return false;
        }
        else {
            return true;
        }
    }

}
