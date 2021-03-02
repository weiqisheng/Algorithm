package com.example.algorithm.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiqisheng
 * @Title: Offer21exchange
 * @ProjectName algorithm
 * @Description: TODO 调整数组顺序使奇数位于偶数前面
 * @date 2021/2/2615:57
 */
/*
TODO 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
示例：

输入：nums = [1,2,3,4]
输出：[1,3,2,4]
注：[3,1,2,4] 也是正确的答案之一。

 */
public class Offer21exchange {

    public int[] exchange(int[] nums) {
       List<Integer> list = new ArrayList<>();
       List<Integer> list1 = new ArrayList<>();;
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] % 2 == 0){
               list1.add(nums[i]);
           }else {
               list.add(nums[i]);
           }
       }
       list.addAll(list1);
       for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
       }
       return nums;
    }

    //快慢双指针
    public int[] exchange1(int[] nums) {
        int fast = 0;
        int low = 0;
        while (fast<nums.length){
            if ((nums[fast] & 1) == 1){
                int temp = nums[low];
                nums[low] = nums[fast];
                nums[fast] = temp;
                low++;

            }
            fast++;
        }
        return nums;
    }

    //双指针
    public int[] exchange2(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }

}
