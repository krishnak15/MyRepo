/*
Sum of Digits!

Given a number A, we need to find the sum of its digits using recursion.
*/

public class Solution {
    public int solve(int A) {
        return sumn(A);
    }
    public int sumn(int n)
    {
        if(n<10)
        {
            return n%10;
        }
       
       int i= sumn(n/10);
       return (i + n%10) ;
    }
}
