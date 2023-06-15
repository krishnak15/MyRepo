/*
 SUBARRAY OR

 You are given an array of integers A of size N.

The value of a subarray is defined as BITWISE OR of all elements in it.

Return the sum of value of all subarrays of A % 109 + 7.
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {          
        int n=A.size();              
        long ans = 0l;
        int mod=1000000009;
        // Traverse from 1st bit to last bit which
        // can be set in any element of the array
        for (int i = 0; i <= 30; i++) {
        int ind=n;
        
        for(int j=n-1;j>=0;j--)
        {
            int bit=(A.get(j)>>i)&1;
            if(bit==1)
            ind=j;

            ans=(ans +(long)( (n-ind)*Math.pow(2,i)))%mod;
        }
        
        }

        return (int)(ans%mod);
    }   
    
}
