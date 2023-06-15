/*
Sum the Difference
Given an integer array, A of size N.
You have to find all possible non-empty subsequences of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence. Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.

*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int i=0;
        int n=A.size();
        long min=0l,max=0l;
        int ans=0;
        int mod=1000000007;
       
         Collections.sort(A);
       
        for(i=0;i<n;i++)
        {
                min=min*2;
                min=(min+A.get(i))%mod;
              
        }
         for(i=n-1;i>=0;i--)
        {
                max=max*2;
                max=(max+A.get(i))%mod;
              
        }

        return (int)((max-min+mod)%mod);
    }
}
