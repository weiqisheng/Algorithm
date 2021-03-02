package com.example.algorithm.offer;

/**
 * @author weiqisheng
 * @Title: Offer15hammingWeight
 * @ProjectName algorithm
 * @Description: TODO 二进制中1的个数
 * @date 2021/2/2414:05
 */
/*
TODO 请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如,
TODO 把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。

 */
public class Offer15hammingWeight {

    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static void test(int number){
        String result = "";
        while (0 != number) {
            result = number % 2 + result;
            number = number / 2;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
        test(8);
    }
}
