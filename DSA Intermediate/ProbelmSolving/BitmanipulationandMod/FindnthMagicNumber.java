/*
Find nth Magic Number

Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

*/
public class Solution {
    public int solve(int A) {

        int ans=0,i=1;

        if((A&1)==1)
        {
            ans=5; //1*5
        }

        while(A>0)
        {
            i++;
            if(((A>>1)&1)==1)
            {
                ans =ans + (int)Math.pow(5,i);
            }
            A=A>>1;
        }

        return ans;
        
    }
}
