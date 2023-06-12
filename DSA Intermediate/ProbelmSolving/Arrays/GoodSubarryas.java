/*
Good Subarrays Easy

Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        int i,j,k,sum=0,count=0,subArraySize;

        for(i=0;i<A.size();i++)
         {
            sum=0;
            subArraySize=0;
            for(j=i;j<A.size();j++)
            {
                subArraySize++;                
                sum=sum+A.get(j);
                if(subArraySize%2==0 && sum<B)
                {
                    count++;
                }
                if(subArraySize%2!=0 && sum>B)
                {
                    count++;
                }

            }

            

        }

        return count;

    }
}
