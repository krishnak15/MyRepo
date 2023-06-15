/*
Check anagrams

You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
*/
public class Solution {
    public int solve(String A, String B) {

        char chA[]=A.toCharArray();
        char chB[]=B.toCharArray();
        Arrays.sort(chA);
        Arrays.sort(chB);

        String sortedA = new String(chA);
        String sortedB = new String(chB);

        if(sortedA.equals(sortedB))
        {
            return 1;
        }
        else
        return 0;

    }
}
