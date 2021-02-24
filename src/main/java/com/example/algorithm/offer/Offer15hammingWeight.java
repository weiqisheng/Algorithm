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
     String str = "";
        while(n != 0){
            str = (n & 1) + "" + str;
            n >>>= 1;
        }
        System.out.println(str);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }
}
