package com.example.algorithm.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author weiqisheng
 * @Title: Offer06
 * @ProjectName algorithm
 * @Description: TODO 从尾到头打印链表
 * @date 2021/2/1910:04
 */
/*
TODO 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Offer06reversePrint {

    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode nextNode = head;
        while (nextNode != null){
            list.add(nextNode.val);
            nextNode = nextNode.next;
        }
        int[] nums = new int[list.size()];
        int j=0;
        for (int i = list.size()-1;i >= 0; i--){
            nums[j++] = list.get(i);
        }
        return nums;
    }

    /**
     * 通过栈，先进后出
     * @param head
     * @return
     */
    public int[] reversePrint2(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode nextNode = head;
        while (nextNode != null){
            stack.push(nextNode.val);
            nextNode = nextNode.next;
        }
        int[] nums = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            nums[i] = stack.pop();
        }
        return nums;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
