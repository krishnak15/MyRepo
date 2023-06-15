/*
Nodes Count
You are given the root node of a binary tree A. You have to find the number of nodes in this tree.
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
        return treeSize(A);
    }
    public int treeSize(TreeNode A)
    {
        if(A==null)
        {
            return 0;
        }
        int l=treeSize(A.left);
        int r=treeSize(A.right);
        return l+r+1;
    }
}
