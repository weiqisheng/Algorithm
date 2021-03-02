package com.example.algorithm.offer;

/**
 * @author weiqisheng
 * @Title: Offer17printNumbers
 * @ProjectName algorithm
 * @Description: TODO 打印从1到最大的n位数
 * @date 2021/2/2614:34
 */
/*
TODO 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。

示例 1:

输入: n = 1
输出: [1,2,3,4,5,6,7,8,9]

 */
public class Offer17printNumbers {

    public static int[] printNumbers(int n) {
        if ( n ==0){
            return null;
        }
       Integer num = Integer.parseInt(String.valueOf(Math.pow(10,n)).split("[.]")[0])-1;
       int[] nums = new int[num];
       for (int i = 0; i < num; i++){
           nums[i] = i + 1;
       }
       return nums;
    }

    public int[] printNumbers1(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++){
            res[i] = i + 1;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(printNumbers(2));
    }
}
