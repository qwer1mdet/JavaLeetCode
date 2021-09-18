package com.leetcode.day7.ListTest;

import com.leetcode.day7.RemoveElements;

public class NodeTest {
    public static void main(String[] args) {
        SingleListed singleListed = new SingleListed();
        //1,2,6,3,4,5,6
        singleListed.addFirst(6);
        singleListed.addFirst(5);
        singleListed.addFirst(4);
        singleListed.addFirst(3);
        singleListed.addFirst(6);
        singleListed.addFirst(2);
        singleListed.addFirst(1);
        singleListed.display();
        System.out.println("单链表长度："+singleListed.getLength());
    }
}
