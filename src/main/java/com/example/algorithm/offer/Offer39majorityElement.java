package com.example.algorithm.offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author weiqisheng
 * @Title: Offer39majorityElement
 * @ProjectName algorithm
 * @Description: TODO 数组中出现次数超过一半的数字
 * @date 2021/3/410:36
 */
/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。

示例 1:

输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
输出: 2

 */
public class Offer39majorityElement {

    public int majorityElement(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int count = 0;
            if (set.contains(nums[i])){
                continue;
            }
            for (int j=0;j<nums.length;j++){
                if (nums[i]  == nums[j]){
                    count++;
                }
            }
            if (count > nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }

    public int majorityElement1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int j=0;j<nums.length;j++){
            if (map.containsKey(nums[j])){
                map.put(nums[j],map.get(nums[j]) +1);
            }else {
                map.put(nums[j],1);
            }
        }
        for (Integer s : map.keySet()){
            if (map.get(s) > nums.length/2){
                return s;
            }
        }
        return 0;
    }

    public int majorityElement2(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }

}
