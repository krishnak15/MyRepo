/*
Longest Palindromic Substring

Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).
*/
public class Solution {
    public String longestPalindrome(String A) {
            int i,ans=0;
            String ansString="";
            String outputString="";
            for(i=0;i<A.length();i++)
            {
                ansString=expand(A,i,i);
                if(ans<ansString.length())
                {
                    ans=ansString.length();
                    outputString=ansString;
                }


            }
               for(i=0;i<A.length()-1;i++)
            {
                 ansString=expand(A,i,i+1);
                if(ans<ansString.length())
                {
                    ans=ansString.length();
                    outputString=ansString;
                }

            }
            
            return outputString;
        

    }

    public String expand(String A,int p1,int p2)
    {
        String abc="";
        String a1=new String(A);
        while(p1>=0 && p2<A.length() && A.charAt(p1)==A.charAt(p2))
        {
            p1--;
            p2++;
        }
        abc=a1.substring(p1+1,p2);
        return abc;
    }
}
