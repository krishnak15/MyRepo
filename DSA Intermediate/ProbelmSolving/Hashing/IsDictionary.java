/*
 Is Dictionary?

Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
*/

public class Solution {
    public int solve(ArrayList<String> A, String B) {
        int i=0;
        int n=A.size();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(i=0;i<26;i++)
        {
            hm.put(B.charAt(i),i);
        }

        for(i=1;i<n;i++)
        {
            if(compare(A.get(i-1),A.get(i),hm)==false)
            {
                return 0;
            }
        }
        return 1;
    }

    public boolean compare(String s1,String s2,HashMap<Character,Integer> hm)
    {
        int minlen=Math.min(s1.length(),s2.length());
        int i=0;

        for(i=0;i<minlen;i++)
        {
            if(hm.get(s1.charAt(i))==hm.get(s2.charAt(i)))
            continue;
            else if(hm.get(s1.charAt(i))>hm.get(s2.charAt(i)))
             return false;
             else
             break;
        }

        if(i<minlen)
        return true;
        if(s1.length()<=s2.length())
        {
            return true;
        }
        else
        return false;
    }
}
