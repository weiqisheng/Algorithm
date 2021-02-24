package com.example.algorithm.offer;

/**
 * @author weiqisheng
 * @Title: Offer101fib
 * @ProjectName algorithm
 * @Description: TODO  斐波那契数列 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * @date 2021/2/1910:58
 */

/**
 F(0) = 0,   F(1) = 1
 F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class Offer101fib {

    public int fib(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        return fib(n-1)  + fib(n-2);
    }

    public int fib1(int n) {
        int sum,a = 0,b =1;
        for (int i = 0; i < n; i++){
            sum = (a + b)%1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
