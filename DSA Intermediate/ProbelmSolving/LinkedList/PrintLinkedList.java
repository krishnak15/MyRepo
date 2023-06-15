/*
Print Linked List
You are given A which is the head of a linked list. Print the linked list in space separated manner.

Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line
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
        ListNode t=A;
        System.out.print(t.val+" ");
        
        while(t.next!=null)
        {
           
            t=t.next;
            System.out.print(t.val + " ");     
               }
               System.out.println();
    }
}
