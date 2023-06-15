/*
Tree Height
You are given the root node of a binary tree A. You have to find the height of the given tree.

A binary tree's height is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int solve(TreeNode A) {
        return treeHeight(A);
    }
    public int treeHeight(TreeNode A){
        if(A==null){return 0;}
        int l=treeHeight(A.left);
        int r=treeHeight(A.right);
        return Math.max(l,r) + 1;
    }
}
