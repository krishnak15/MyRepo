/*

Special Subsequences "AG"

You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

*/

public class Solution {
    public int solve(String A) {

        int i;
        long ans=0,count=0;
        long m=1000000007;
        char[] charArray = A.toCharArray();

        for(i=charArray.length-1;i>=0;i--)
        {

            if(charArray[i]=='G')
            {
                count++;
            }
            if(charArray[i]=='A')
            {
                                          
                ans=ans+count;
            }

        }

        return (int)(ans%m);


    }
}
