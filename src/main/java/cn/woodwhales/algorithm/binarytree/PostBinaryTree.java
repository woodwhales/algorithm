package cn.woodwhales.algorithm.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author woodwhales on 2021-08-11 22:21
 * @Description 后续遍历
 * 参见：https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 */
public class PostBinaryTree {

    public static void main(String[] args) {
        TreeNode root = TreeNode.generateRoot();
        post(root);
    }

    private static void post(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        post(root, list);
        for (Integer val : list) {
            System.out.print(val + " ");
        }
    }

    /**
     * 后续遍历
     * @param root
     */
    private static void post(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }

        post(root.left, list);
        post(root.right, list);
        list.add(root.val);
    }

}
