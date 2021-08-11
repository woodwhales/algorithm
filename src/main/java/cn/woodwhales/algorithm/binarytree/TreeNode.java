package cn.woodwhales.algorithm.binarytree;

import lombok.Data;

/**
 * @author woodwhales on 2021-08-11 21:56
 * @Description
 */
@Data
public class TreeNode {

    public Integer val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer val) {
        this.val = val;
    }

    public TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     *          1
     *        /   \
     *      3      4
     *     / \    / |
     *    5   6  7  8
     *   /
     *  9
     * @return
     */
    public static TreeNode generateRoot() {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(3);
        root.right = new TreeNode(4);


        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);

        root.left.left.left = new TreeNode(9);
        return root;
    }
}
