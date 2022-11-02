package com.bridgelabz.linkedlist;

public class MyNode <T> implements Node<T>{
    private T key;
    private Node<T> next;

    public MyNode(T key) {

        this.key = key;
        this.next = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("").append(key).append("");

        if(next!=null) {
            myNodeString.append("->").append(next);
        }
        return myNodeString.toString();
    }
}
