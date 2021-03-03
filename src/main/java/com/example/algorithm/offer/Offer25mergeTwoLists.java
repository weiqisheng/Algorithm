package com.example.algorithm.offer;

import java.util.List;

/**
 * @author weiqisheng
 * @Title: Offer25mergeTwoLists
 * @ProjectName algorithm
 * @Description: TODO 合并两个排序的链表
 * @date 2021/3/210:34
 */
/*
TODO 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
示例1：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 */
public class Offer25mergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }

}
