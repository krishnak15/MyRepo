/*
 Odd Even Subsequences

Given an array of integers A of size, N. Find the longest subsequence of A, which is odd-even.

A subsequence is said to be odd-even in the following cases:

The first element of the subsequence is odd; the second element is even, the third element is odd, and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]

The first element of the subsequence is even, the second element is odd, the third element is even, and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]

Return the maximum possible length of odd-even subsequence.

Note: An array B is a subsequence of an array A if B can be obtained from A by deleting several (possibly, zero, or all) elements.

*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
         int i=0; 
        int count=0;
        int eindex=-1;
         int oindex=-1;
        if(A.get(0)%2==0)
        {
            eindex=0;
            count++;
        }
        else 
        {
             oindex=0;
             count++;
        }
        for(i=1;i<A.size();i++)
        {           
            if(A.get(i)%2==0 && i==oindex+1)
            {
                 count++;
                 eindex=i;
            }
            else if(A.get(i)%2!=0 && i==eindex+1)
            {         
                count++;
                 oindex=i;
            }
            else if(A.get(i)%2!=0 )
            {
                oindex=i;
            }
            else if(A.get(i)%2==0 )
            {
                eindex=i;
            }
        }
     
       return count;

    }
}
