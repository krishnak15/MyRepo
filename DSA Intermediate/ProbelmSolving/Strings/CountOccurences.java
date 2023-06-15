/*
 Count Occurrences

Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
*/

public class Solution {
    public int solve(String A) {

        int count=0,i=0;

        if(A.length()<3)
        return 0;

        for(i=0;i<=A.length()-3;i++)
        {

            if(A.charAt(i)=='b'&&A.charAt(i+1)=='o'&&A.charAt(i+2)=='b')
            {
                count++;
            }

        }

        return count;

    }
}
