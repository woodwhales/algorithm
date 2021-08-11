package cn.woodwhales.algorithm.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author woodwhales on 2021-08-11 21:57
 * @Description 前序遍历
 * 参见：https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class PreBinaryTree {

    public static void main(String[] args) {
        TreeNode root = TreeNode.generateRoot();
        pre(root);
    }

    private static void pre(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        pre(root, list);
        for (Integer val : list) {
            System.out.print(val + " ");
        }
    }

    /**
     * 前序遍历
     * @param root
     */
    private static void pre(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        pre(root.left, list);
        pre(root.right, list);
    }

}
