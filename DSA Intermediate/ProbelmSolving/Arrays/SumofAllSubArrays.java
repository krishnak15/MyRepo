/*
Sum of All Subarrays

You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

*/

public class Solution {
    public long subarraySum(ArrayList<Integer> A) {

        int n=A.size();
        int i,freq=0;
        long sum=0;

        for(i=0;i<n;i++)
        {           
            sum += (long)((i+1)*(long)(n-i)*(long)A.get(i));

        }

        return sum;

    }
}
