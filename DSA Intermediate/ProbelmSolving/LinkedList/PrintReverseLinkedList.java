/*
Print Reverse Linked List
You are given a singly linked list having head node A. You need to print the linked list in reverse order.

Note :- The node values must be space separated. You must give a newline after printing all the nodes.
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public void solve(ListNode A) {
       Solvesol(A);
       System.out.println();
    }
    public void Solvesol(ListNode A){
 if(A==null)
        {
            return;
        }
        Solvesol(A.next);
        System.out.print(A.val+" ");
    }
}
