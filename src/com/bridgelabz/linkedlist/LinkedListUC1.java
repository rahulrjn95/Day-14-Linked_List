package com.bridgelabz.linkedlist;

import java.util.Scanner;


public class LinkedListUC1 {
    public int data;
    public MyNodeTest next;

    public static void main(String[] args) {
        MyNodeTest myFirstNode = new MyNodeTest(56, null);
        MyNodeTest mySecondNode = new MyNodeTest(30, null);
        MyNodeTest myThirdNode = new MyNodeTest(70, null);
        System.out.println(myFirstNode);
        System.out.println(mySecondNode);
        System.out.println(myThirdNode);
    }
}
