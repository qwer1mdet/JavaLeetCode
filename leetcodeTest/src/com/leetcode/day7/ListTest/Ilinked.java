package com.leetcode.day7.ListTest;

public interface Ilinked {
    //
    void addFirst(int data);
    void addLast(int data);
    boolean addIndex(int index,int data);
    boolean contains(int key);
    int remove(int key);
    void removeAllkey(int key);
    int getLength();
    void display();
    void clear();
}
