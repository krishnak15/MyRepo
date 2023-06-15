/*
K-th element in linked list
You are given the head of a linked list A and an integer B. You need to find the B-th element of the linked list.

Note : Follow 0-based indexing for the node numbering.
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
    public int solve(ListNode A, int B) {
        int count=1;
        if(B==0)
        {
            return A.val;
        }
        for(int i=1;i<=B;i++)
        {
            A=A.next;
        }
        return A.val;
    }
}
