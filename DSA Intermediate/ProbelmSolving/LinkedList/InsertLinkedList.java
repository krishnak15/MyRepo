/*
 Insert in Linked List
You are given A which is the head of a linked list. Also given is the value B and position C. Complete the function that should insert a new node with the said value at the given position.

Notes:

In case the position is more than length of linked list, simply insert the new node at the tail only.
In case the pos is 0 or less, simply insert the new node at head only.
Follow 0-based indexing for the node numbering.

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
    public ListNode solve(ListNode A, int B, int C) {

        ListNode newn=new ListNode(B); 
         ListNode temp=A;
         int i=0;

        if(C==0)
        {
           newn.next=A;
           A=newn;
            return A;
        }
        else
        {
       
        for(i=1;i<C;i++)
        {
             if(temp.next==null)
             {
                 break;
             }  
             temp=temp.next;   
               
        }
        }
if(temp.next==null || i!=C )
{
     temp.next=newn;
     newn.next=null;
     return A;
}
else{
           
               newn.next=temp.next;
               temp.next=newn;
               return A;

    }       
             
        
        
    }
}
