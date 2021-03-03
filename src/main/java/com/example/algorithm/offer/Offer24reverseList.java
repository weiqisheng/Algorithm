package com.example.algorithm.offer;

import java.util.List;

/**
 * @author weiqisheng
 * @Title: Offer24reverseList
 * @ProjectName algorithm
 * @Description: TODO 反转链表
 * @date 2021/3/29:42
 */
/*
定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL

 */
public class Offer24reverseList {

    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode perNode = null;
        while (node != null){
            ListNode next = node.next;
            node.next = perNode;
            perNode = node;
            node = next;
        }
        return perNode;
    }
}
