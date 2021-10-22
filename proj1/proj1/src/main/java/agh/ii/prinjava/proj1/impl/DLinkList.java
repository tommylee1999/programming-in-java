package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    // ...
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }
    ListNode newNode = new ListNode(value);
    if(isEmpty()){
        tail = newNode;
    } else {
        head.previous = newNode;
    }
    newNode.next = head;
    head = newNode;
}
