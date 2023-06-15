/*
Search in Linked List
You are given the head of a linked list A and an integer B, check if there is any node which contains this value B.

Return 1 if such a node is present else return 0.
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
        if(A.val==B)
        return 1;
        while(A.next!=null)
        {
        A=A.next;
        if(A.val==B)
        {
        return 1;
        }
        
        }
        return 0;
    }
}
