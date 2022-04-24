package com.company;

import java.util.LinkedList;

public class MyQueue<T> {

    private LinkedList<T> linkedList;

    public MyQueue() {
        linkedList = new LinkedList<T>();
    }

    public T peek() {
        return linkedList.get(0);
    }

    public T dequeue() {
        T removingItem = peek();
        linkedList.removeFirst();
        return removingItem;
    }

    public T enqueue(T newItem) {
        linkedList.addLast(newItem);
        return newItem;
    }





}
