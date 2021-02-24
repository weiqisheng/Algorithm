package com.example.algorithm.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author weiqisheng
 * @Title: Offer03findRepeatNumber
 * @ProjectName algorithm
 * @Description: TODO   数组中重复的数字
 * @date 2021/2/198:48
 */

/*
TODO  找出数组中重复的数字。在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
  TODO       但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class Offer03findRepeatNumber {


    public int findRepeatNumber(int[] nums) {

        Set<Integer> set = new HashSet();
        for (int i = 0;i<nums.length;i++){
            if (set.contains(nums[i])){
                return nums[i];
            }else {
                set.add(nums[i]);
            }
        }
        return 0;
    }
}
