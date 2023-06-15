/*
Find subsequence

Given two strings A and B, find if A is a subsequence of B.

Return "YES" if A is a subsequence of B, else return "NO".
*/
public class Solution {
    public String solve(String A, String B) {

        int i=0,j=0;
        int n=A.length();
        int m=B.length();
        if(n>m)
        {
                return "NO";
        }
        while(i<n&&j<m)
        {
            if(A.charAt(i)==B.charAt(j))
            {
                i++;
                j++;
            }
            else
            j++;
        }
        if(i==n)
        {
            return "YES";
        }
        else
        return "NO";

    }
}
