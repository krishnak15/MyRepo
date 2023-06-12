/*
1. Find Perfect Numbers

Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number.


*/

public class Solution {
    public int solve(int A) {

        int i=0,n=0,sum=0;
        n=A;
            if(A==1)
            return 0;
            for(i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    if(i==n/i)
                    sum=sum +i;
                    else
                    sum = sum + i + n/i;

                }


            }
        sum=sum + 1;

        if(A==sum)
        return 1;
        else
        return 0;

    }
}
