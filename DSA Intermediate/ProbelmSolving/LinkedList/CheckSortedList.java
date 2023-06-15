/*
Check sorted Linked List
You are given the head of a linked list A. Check if the data inside it exists in non-decreasing order
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
    public int solve(ListNode A) {
        int x=checksort(A);
        return x;
    }
    int checksort(ListNode A)
    {
        if(A.next==null)
        {
        return 1;
        }
        if(A.val>A.next.val)
        {
            return 0;
        }
        
        return checksort(A.next);
        
    }
}
