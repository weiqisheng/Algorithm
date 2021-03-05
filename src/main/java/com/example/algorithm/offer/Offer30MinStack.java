package com.example.algorithm.offer;

import java.util.Stack;

/**
 * @author weiqisheng
 * @Title: Offer30MinStack
 * @ProjectName algorithm
 * @Description: TODO
 * @date 2021/3/59:38
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
