package com.company;

import java.util.LinkedList;

public class MyStack<T>{

    private LinkedList linkedList;

    public MyStack(){
        linkedList = new LinkedList();
    }

    public boolean empty(){
        if (linkedList.size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return size();
    }

    public T peek(){
        return (T) linkedList.get(0);
    }

    public T push(T newItem){
        linkedList.addFirst(newItem);
        return newItem;
    }

    public T pop(){
        T removingItem = peek();
//        remove front
        linkedList.removeFirst();
        return removingItem;
    }


}