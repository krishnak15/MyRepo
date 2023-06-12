/*
 Counting Subarrays Easy

Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.

*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        int i=0,j=0,sum=0,count=0;       

        for(i=0;i<A.size();i++)
        {
            sum=0;
            for(j=i;j<A.size();j++)
            {
                sum=sum+A.get(j);
                
                if(sum<B)
                {
                    count++;
                }

            }

        }

        return count;





    }
}
