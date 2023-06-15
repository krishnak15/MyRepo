/*
 Simple Reverse

Given a string A, you are asked to reverse the string and return the reversed string.

*/

public class Solution {
    public String solve(String A) {
       
        int n=A.length();
        int i=0,j=n-1;
         char[] ch=new char[A.length()];
        while(i<n)
        {
            ch[i]=A.charAt(j);
            i++;
            j--;
        }

        return  String.valueOf(ch);
    }
}
