package com.leetcode.day7;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }else if (l1.val<l2.val){
            l1=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2=mergeTwoLists(l2.next,l1);
            return l2;
        }

    }
}
