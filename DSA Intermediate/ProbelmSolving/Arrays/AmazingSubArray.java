/*
Amazing Subarrays

You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

*/

public class Solution {
    public int solve(String A) {

        int i;
        long count=0,ans=0;
      //  String B = A.toUpperCase();
        char[] ch=A.toCharArray();

        for(i=ch.length-1;i>=0;i--)
        {
           
            count++;
            if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                ans=ans+count;
            }
        }

        return (int)(ans%10003);
    }
}
