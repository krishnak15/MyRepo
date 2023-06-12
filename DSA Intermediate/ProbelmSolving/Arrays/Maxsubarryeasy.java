/*
 Maximum Subarray Easy

You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.
*/

public class Solution {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {

        int i=0,j=0,sum=0;

        int maxSum=0;

        for(i=0;i<A;i++)
        {
            sum=0;
            for(j=i;j<A;j++)
            {
                sum=sum+C.get(j);
                
                if(sum<=B && sum>maxSum)
                {
                    maxSum=sum;
                }

            }

        }

        return maxSum;

    }
}
