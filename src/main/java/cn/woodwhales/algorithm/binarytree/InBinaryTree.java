package cn.woodwhales.algorithm.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author woodwhales on 2021-08-11 22:19
 * @Description 中序遍历
 * 参见：https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class InBinaryTree {

    public static void main(String[] args) {
        TreeNode root = TreeNode.generateRoot();
        in(root);
    }

    private static void in(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        in(root, list);
        for (Integer val : list) {
            System.out.print(val + " ");
        }
    }

    /**
     * 中序遍历
     * @param root
     */
    private static void in(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }

        in(root.left, list);
        list.add(root.val);
        in(root.right, list);
    }

}
