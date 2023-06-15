/*
Sum of Left Leaves

Given a binary tree, find and return the sum of node value of all left leaves in it.
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
        return helper(null,A);
    }
    public int helper(TreeNode parent, TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.left==null && node.right==null && parent!=null && parent.left==node)
        {
            return node.val;
         }
         return helper(node,node.left)+helper(node,node.right);
    }
}
 

