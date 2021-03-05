package com.example.algorithm.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author weiqisheng
 * @Title: Offer40getLeastNumbers
 * @ProjectName algorithm
 * @Description: TODO 最小的k个数
 * @date 2021/3/49:13
 */
/*
输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
示例 1：

输入：arr = [3,2,1], k = 2
输出：[1,2] 或者 [2,1]
示例 2：
输入：arr = [0,1,2,1], k = 1
输出：[0]
 */
public class Offer40getLeastNumbers {

    public int[] getLeastNumbers(int[] arr, int k) {
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            list.sort((a,b) ->a.compareTo(b));
            int[] arrs = new  int[k];
            for (int i=0;i<k;i++){
                arrs[i] = list.get(i);
            }
            return arrs;
    }
    public int[] getLeastNumbers1(int[] arr, int k) {

        for (int i =0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                int temp = arr[i];
                if (temp > arr[j]){
                    arr[i] = arr[j];
                    arr[j]  =  temp;
                }
            }
        }
        int[] arrs = new int[k];
        for (int i=0;i<k;i++){
            arrs[i] = arr[i];
        }
        return arrs;
    }

    public int[] getLeastNumbers2(int[] arr, int k) {
        int[] vec = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; ++i) {
            vec[i] = arr[i];
        }
        return vec;
    }


}
