package com.bridgelabz.linkedlist;

public class MyNodeTest {
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyNodeTest getNext() {
        return next;
    }

    public void setNext(MyNodeTest next) {
        this.next = next;
    }

    public int data;
    public MyNodeTest next;

    public MyNodeTest(int data, MyNodeTest next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data + "";
    }
}
