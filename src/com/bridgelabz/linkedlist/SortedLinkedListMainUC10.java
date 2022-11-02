package com.bridgelabz.linkedlist;

public class SortedLinkedListMainUC10 {
    public static void main(String[] args) {

        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(40);
        MyNode<Integer> test = new MyNode<Integer>(70);

        SortedLinkedListUC10 mySortedLinkedList = new SortedLinkedListUC10();
        mySortedLinkedList.add(firstNode);
        mySortedLinkedList.add(secondNode);
        mySortedLinkedList.add(thirdNode);
        mySortedLinkedList.add(test);
        System.out.println("Original Sorted Linked List");
        mySortedLinkedList.printSortedLinkedListUC10();

        mySortedLinkedList.remove(40);
        System.out.println("Linked List after removing 40");
        mySortedLinkedList.printSortedLinkedListUC10();

        System.out.println("The size of the List is: "+mySortedLinkedList.size());
        System.out.println("The key 56 is at index : "+mySortedLinkedList.index(56));
        System.out.println("Is the list empty? "+mySortedLinkedList.isEmpty());
        System.out.println("Is 71 in the linked list? "+mySortedLinkedList.search(71));
        System.out.println("Popping the last element");
        mySortedLinkedList.pop();
        mySortedLinkedList.printSortedLinkedListUC10();
    }
}
