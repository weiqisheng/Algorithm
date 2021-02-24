package com.example.algorithm.offer;

import java.util.Stack;

/**
 * @author weiqisheng
 * @Title: Offer09CQueue
 * @ProjectName algorithm
 * @Description: TODO 用两个栈实现队列
 * @date 2021/2/1910:31
 */
/*

TODO 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
TODO 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

 */
public class Offer09CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Offer09CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
       if (stack2.empty()){
           while (!stack1.isEmpty()){
               stack2.push(stack1.pop());
           }
       }
       if (stack2.isEmpty()){
           return  -1;
       }else {
           return stack2.pop();
       }
    }
}
