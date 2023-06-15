/*
Counting the Nodes
Given the root of a tree A with each node having a certain value, find the count of nodes with more value than all its ancestor.
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
        return helper(A,0);
    }
    public int helper(TreeNode node, int max)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.val>max)
        {
            return 1+helper(node.left,node.val)+helper(node.right,node.val);
        }
        else
        {
            return helper(node.left,max)+helper(node.right,max);
        }
    }
}
