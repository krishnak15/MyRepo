/*
Postorder Traversal

Given a binary tree, return the Postorder traversal of its nodes values.

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
    public ArrayList<Integer> postorderTraversal(TreeNode A) { 
       // ArrayList<Integer> treearray=new ArrayList<Integer>();
ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> S = new Stack<TreeNode>();
 
        // Check for empty tree
        if (A == null)
            return list;
        S.push(A);
        TreeNode prev = null;
        while (!S.isEmpty()) {
            TreeNode current = S.peek(); 
 if (prev == null || prev.left == current || prev.right == current) {
                if (current.left != null)
                    S.push(current.left);
                else if (current.right != null)
                    S.push(current.right);
                else {
                    S.pop();
                    list.add(current.val);
                }
 
                /* go up the tree from left node, if the
                child is right push it onto stack otherwise
                process parent and pop stack */
            }
            else if (current.left == prev) {
                if (current.right != null)
                    S.push(current.right);
                else {
                    S.pop();
                    list.add(current.val);
                }
 
                /* go up the tree from right node and after
                coming back from right node process parent
                and pop stack */
            }
            else if (current.right == prev) {
                S.pop();
                list.add(current.val);
            }
 
            prev = current;
        }
   
   return list;
    }
}

