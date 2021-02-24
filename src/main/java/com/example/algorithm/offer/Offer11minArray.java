package com.example.algorithm.offer;

/**
 * @author weiqisheng
 * @Title: Offer11minArray
 * @ProjectName algorithm
 * @Description: TODO 旋转数组的最小数字

 * @date 2021/2/1916:09
 */
public class Offer11minArray {

    public int minArray(int[] numbers) {
        int mix = Integer.MAX_VALUE;
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i] < mix){
                mix = numbers[i];
            }
        }
        return mix;
    }

    public static int minArray2(int[] numbers) {
        int i =0;int j = numbers.length-1;
        while (i < j){
            int num = (i + j)/2;
            if(numbers[num] > numbers[j]){
                i= num + 1;
            }else if (numbers[num] < numbers[j]){
                j = num;
            }else {
                j--;
            }
        }
        return numbers[i];
    }
}
