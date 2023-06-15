/*
Sum of nodes of a Binary Tree
Given the root of a binary tree A. Return the sum of all the nodes of the binary tree.
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
        return treeSum(A);
    }
    public int treeSum(TreeNode A)
    {
        if(A==null)
        {
            return 0;
        }
        int lsum=treeSum(A.left);
        int rsum=treeSum(A.right);
        return lsum+rsum+A.val;
    }
}
