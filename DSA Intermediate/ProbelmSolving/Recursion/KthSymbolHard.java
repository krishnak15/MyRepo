/*
Kth Symbol - Hard

On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
*/
public class Solution {
    public int solve(int A, Long B) {
    
return Athrow(A,B);

    }

    public int Athrow(int n,Long k)
    {
        if(n==0||k==0) 
        return 0;
        if(k%2==0)
        return  Athrow(n-1,k/2);
        else
       return 1-Athrow(n-1,k/2);
    }
 
}
