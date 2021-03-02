package com.example.algorithm.offer;

/**
 * @author weiqisheng
 * @Title: Offer15deleteNode
 * @ProjectName algorithm
 * @Description: TODO 删除链表的节点
 * @date 2021/2/2615:11
 */
/*
TODO 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。

返回删除后的链表的头节点。

注意：此题对比原题有改动

示例 1:

输入: head = [4,5,1,9], val = 5
输出: [4,1,9]
解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 */
public class Offer15deleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode previous = head;
        if (previous.val == val){
            return previous.next;
        }
        ListNode nextNode  = head.next;
        while (nextNode != null){
            if (nextNode.val == val){
                previous.next = nextNode.next;
                break;
            }else {
                previous = nextNode;
                nextNode = nextNode.next;
            }
        }
        return head;
    }

    public ListNode deleteNode1(ListNode head, int val) {
        if (head == null){
            return head;
        }
        if (head.val == val){
            return head.next;
        }
        ListNode perNode = head;
        ListNode curNode = head.next;
        while (curNode != null && curNode.val != val){
            perNode  = curNode;
            curNode = curNode.next;
        }
        perNode.next = (curNode == null) ? null : curNode.next;
        return head;
    }
}
