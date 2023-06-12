/*
 Divisibility by 3

Given a number in the form of an array A of size N. Each of the digits of the number is represented by A[i]. Check if the number is divisible by 3.

*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int i=0;
        int ans=0;

        for(i=0;i<A.size();i++)
        {
            ans= ans + A.get(i);
        }

        if(ans%3==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
