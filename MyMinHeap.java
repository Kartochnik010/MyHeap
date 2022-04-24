package com.company;


import java.util.LinkedList;

public class MyMinHeap<T extends Comparable<T>> {
    private int size;
    private LinkedList<T> heap;


    public MyMinHeap() {
        heap = new LinkedList<>();
    }

    public boolean empty(){
        return heap.size() == 0;
    }

    public int size(){
        return size;
    }

    public T getMin(){
        return heap.get(1);
    }


    public T extractMin(){
        T removingItem = heap.get(1);
        heap.remove(1);
        return removingItem;
    }

    public void insert(T newItem){
        heap.addLast(newItem);
    }

    public void heapify(int index){
    T left = heap.get(leftChild(index));
    T right = heap.get(rightChild(index));

    if (left.compareTo(right) > 0){
        swap(leftChild(index), rightChild(index));
    }

    }

    private int leftChild(int index){
        return index * 2;
    }

    private int rightChild(int index){
        return index * 2 + 1;
    }

    private int parent(int index){
        return index / 2;
    }

    private void swap(int firstIndex, int secondIndex){
        T temp = heap.get(firstIndex);
        heap.add(firstIndex, heap.get(secondIndex));
        heap.add(secondIndex, temp);
    };

}
