/*
 Inorder Traversal
 Given a binary tree, return the inorder traversal of its nodes' values.
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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
   
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
                s.push(A);
                A=A.left;
            }
            A= s.pop();
            treearray.add(A.val);
             A=A.right;
           
        }
   
   return treearray;
    }
   
}
