/*
 Preorder Traversal
Given a binary tree, return the preorder traversal of its nodes values.

NOTE: Using recursion is not allowed.
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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> treearray=new ArrayList<Integer>();

        Stack<TreeNode> s=new Stack<TreeNode>();   
        if(A==null)
        {
            return treearray;
        }   

        while(A!=null || s.size()>0)
        {           
            while(A!=null)
            {
                 treearray.add(A.val);
                 if(A.right!=null)
                        s.push(A.right);
                A=A.left;
            }

            if (!s.isEmpty())
        {
            A = s.pop();
        }
           
        }
   
   return treearray;
    }
}
