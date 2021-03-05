package com.example.algorithm.offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author weiqisheng
 * @Title: Offer28isSymmetric
 * @ProjectName algorithm
 * @Description: TODO 对称的二叉树
 * @date 2021/3/411:09
 */
/*
请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3
 */
public class Offer28isSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        /*
            构建 堆栈：
                先将 根节点的左右子节点 入栈
        */
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curNode = root;
        stack.push(curNode.left);
        stack.push(curNode.right);

        /*
            遍历 整棵树：
                1、将 当前栈中 最上面两个节点 弹出，这两个节点对于整棵树来说 一定是 应该对称的
                2、判断 两节点是否都为空，若是，则当前两节点相同，满足对称性质，跳过本轮循环
                3、判断 两节点值是否相等：
                    若不等，返回false
                    若相等，将 两节点的左右子节点，按照对称性质入栈
        */
        while (!stack.isEmpty()) {
            TreeNode leftNode = stack.pop();
            TreeNode rightNode = stack.pop();
            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null
                    || leftNode.val != rightNode.val) {
                return false;
            }
            stack.push(leftNode.left);
            stack.push(rightNode.right);
            stack.push(leftNode.right);
            stack.push(rightNode.left);
        }

        return true;
    }

    public boolean isSymmetric1(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }
    boolean recur(TreeNode L, TreeNode R) {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }

}
