/*
Compare Linked List
Given heads of two linked lists A and B, check if they are identical i.e. each of their corresponding nodes should contain the same data. The two given linked lists may or may not be of the same length.

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
    public int solve(ListNode A, ListNode B) {
        int flag=0;
        while(A.next!=null || B.next!=null)
        {
            if(A.val!=B.val)
            {
            return 0;
            }
            
            A=A.next;
            B=B.next;
        }
        if(A.next==null && B.next==null && A.val==B.val)
        return 1;
        else
        return 0;
    }
}
