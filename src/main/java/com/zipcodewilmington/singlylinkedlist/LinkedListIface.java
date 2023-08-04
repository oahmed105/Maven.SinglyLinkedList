package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

public interface LinkedListIface <T extends Comparable<T>> {

    public void add(T data);

//    void add(Comparable data);

    public void remove(int index) throws IndexOutOfBoundsException;
    public T get(int index) throws IndexOutOfBoundsException;
    public boolean contains(T data);
    public int find(T data);

//    boolean contains(Comparable data);

    public int size();
    public SinglyLinkedList<T> copy();

//    public void sort(Comparator<T> comparator);

    void sort();
}
