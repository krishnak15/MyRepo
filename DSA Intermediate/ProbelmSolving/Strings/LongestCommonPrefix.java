/*
 Longest Common Prefix

Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".

*/

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {

       StringBuilder sb=new StringBuilder();
         StringBuilder sub=new StringBuilder();
         StringBuilder stringA=new StringBuilder();
        int n=A.size();
        int i=0,j=0;
        sb=sb.append(A.get(0));
        sub=sub.append(A.get(0));
         
        for(i=1;i<n;i++)
        {
             stringA.setLength(0);
            stringA= stringA.append(A.get(i));
             sub.setLength(0);
            for(j=0;j<Math.min(sb.length(),stringA.length());j++)
            {
               
                if(stringA.charAt(j)==sb.charAt(j))
                {
                    sub.append(stringA.charAt(j));
                }
                else
                {
                    break;
                }
            }
         
            sb.setLength(0);
            sb=sb.append(sub);
          
        }

        return sb.toString();

    }
}
