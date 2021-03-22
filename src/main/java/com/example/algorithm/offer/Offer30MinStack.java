package com.example.algorithm.offer;

import java.util.Stack;

/**
 * @author weiqisheng
 * @Title: Offer30MinStack
 * @ProjectName algorithm
 * @Description: TODO 包含min函数的栈
 * @date 2021/3/59:38
 */
/*
定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.min();   --> 返回 -2.

 */
public class Offer30MinStack {

    Stack<Integer> a;
    Stack<Integer> b;
    public Offer30MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.add(x);
        if (b.isEmpty() || b.peek() >= x){
            b.add(x);
        }
    }

    public void pop() {
        Integer pop = a.pop();
        if (pop.equals(b.peek())){
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}
