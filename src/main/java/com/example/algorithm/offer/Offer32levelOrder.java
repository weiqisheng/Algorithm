package com.example.algorithm.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author weiqisheng
 * @Title: Offer32levelOrder
 * @ProjectName algorithm
 * @Description: TODO  - II. 从上到下打印二叉树 II
 * @date 2021/3/514:59
 */
/*
从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。

 

例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层次遍历结果：

[
  [3],
  [9,20],
  [15,7]
]
 */
public class Offer32levelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i=queue.size(); i >0; i--){
                TreeNode poll = queue.poll();
                temp.add(poll.val);
                if (poll.left != null){
                    queue.add(poll.left);
                }
                if (poll.right != null){
                    queue.add(poll.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
