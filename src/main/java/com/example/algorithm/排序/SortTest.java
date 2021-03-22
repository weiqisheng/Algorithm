package com.example.algorithm.排序;

import java.util.Arrays;

/**
 * @author weiqisheng
 * @Title: SortTest
 * @ProjectName algorithm
 * @Description: TODO  主要去实现几种排序算法
 * @date 2021/3/814:30
 */
public class SortTest {


    // TODO  冒泡排序
    // TODO 它是一种较简单的排序算法。它会遍历若干次要排序的数列，每次遍历时，它都会从前往后依次的比较相邻两个数的大小；
    // 如果前者比后者大，则交换它们的位置。这样，一次遍历之后，最大的元素就在数列的末尾！ 采用相同的方法再次遍历时，
    //  第二大的元素就被排列在最大元素之前。重复此操作，直到整个数列都有序为止！
    public static int[] bubbleSort(int[] a, int n) {
        int i,j;

        for (i=n-1; i>0; i--) {
            // 将a[0...i]中最大的数据放在末尾
            for (j=0; j<i; j++) {

                if (a[j] > a[j+1]) {
                    // 交换a[j]和a[j+1]
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        return a;
    }
    /*
        * TODO 冒泡排序(改进版)
        *
        * 参数说明:
        *     a -- 待排序的数组
        *     n -- 数组的长度
        */
    public static int[]  bubbleSort1(int[] a, int n) {
        int i,j;
        int flag;                 // 标记

        for (i=n-1; i>0; i--) {

            flag = 0;            // 初始化标记为0
            // 将a[0...i]中最大的数据放在末尾
            for (j=0; j<i; j++) {
                if (a[j] > a[j+1]) {
                    // 交换a[j]和a[j+1]
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;

                    flag = 1;    // 若发生交换，则设标记为1
                }
            }
            if (flag==0)
                break;            // 若没发生交换，则说明数列已有序。
        }
        return a;
    }

    // TODO  选择排序 自己写的
    // TODO  它的基本思想是: 首先在未排序的数列中找到最小(or最大)元素，然后将其存放到数列的起始位置；接着，
    // 再从剩余未排序的元素中继续寻找最小(or最大)元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
    public static int[] selectSort(int[] nums){
       for(int i = 0; i < nums.length; i++){
           int mix = i;
           for (int j = i+1; j < nums.length; j++) {
               if (nums[j] < nums[mix]){
                   mix = j;
               }
           }
           if (mix != i){
               int temp = nums[i];
               nums[i] = nums[mix];
               nums[mix] = temp;
           }
       }
       return nums;
    }
    // TODO 插入排序  自己写的方法
    // 直接插入排序(Straight Insertion Sort)的基本思想是: 把n个待排序的元素看成为一个有序表和一个无序表。
    // 开始时有序表中只包含1个元素，无序表中包含有n-1个元素，排序过程中每次从无序表中取出第一个元素，
    //  将它插入到有序表中的适当位置，使之成为新的有序表，重复n-1次可完成排序过程。
    public static int[] insertSort(int[] nums){

        for(int i = 1  ; i < nums.length; i++){
            int per = i;
            for (int j = i-1; j >= 0; j--){
                if (nums[j] < nums[per]){
                    break;
                }else {
                   int temp = nums[per];
                   nums[per] = nums[j];
                   nums[j] = temp;
                   per=j;
                }
            }
        }
        return nums;
    }
    // TODO 插入排序
    public static void insertSort1(int[] a, int n) {
        int i, j, k;

        for (i = 1; i < n; i++) {

            //为a[i]在前面的a[0...i-1]有序区间中找一个合适的位置
            for (j = i - 1; j >= 0; j--)
                if (a[j] < a[i])
                    break;

            //如找到了一个合适的位置
            if (j != i - 1) {
                //将比a[i]大的数据向后移
                int temp = a[i];
                for (k = i - 1; k > j; k--)
                    a[k + 1] = a[k];
                //将a[i]放到正确位置上
                a[k + 1] = temp;
            }
        }
    }



    public static void main(String[] args) {
        int[] nums = new int[]{5,2,4,8,3,6,1};
        System.out.println(Arrays.toString(selectSort(nums)));
        System.out.println(Arrays.toString(insertSort(nums)));
    }
}
