package com.leetcode.day7;

import com.leetcode.day7.ListTest.SingleListed;

/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {

        return head;
    }
    public  ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    // 递归，递归含义：删除为val的节点，返回删除后的头节点
    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return removeElements(head.next, val); // 头节点需要删除，返回后面的头
        head.next = removeElements(head.next, val);
        return head;
    }
}
