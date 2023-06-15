/*
Delete in Linked List
You are given the head of a linked list A and an integer B. Delete the B-th node from the linked list.

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
    public ListNode solve(ListNode A, int B) {

         int i=0;
         ListNode temp=A;
        if(B==0)
        {
           A=A.next;
            return A;
        }
        else
        {
       
        for(i=1;i<B;i++)
        {

             temp=temp.next;   
               
        }
        temp.next=temp.next.next;
       
               return A;

    }       
        
    }
}
