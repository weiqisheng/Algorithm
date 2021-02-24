package com.example.algorithm.offer;

/**
 * @author weiqisheng
 * @Title: Offer102numWays
 * @ProjectName algorithm
 * @Description: TODO 青蛙跳台阶问题
 * @date 2021/2/1911:50
 */

/**
 TODO 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class Offer102numWays {

    //递归
    public static int numWays(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        return numWays(n-1)  + numWays(n-2);
    }
    //动态规划
    public static int numWays1(int n) {
        int a = 1,b =1,sum;
        for (int i = 0; i < n; i++){
            sum = (a + b)%1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(numWays1(7));
    }
}
