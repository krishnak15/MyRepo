/*

 Check Palindrome

 Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.

*/

public class Solution {
    public int solve(String A) {

      return palin(A,0,A.length()-1);

    }

    public int palin(String A,int s,int e)
    {
        if(s==e||s>e)
        {
            return 1;
        }
        if(A.charAt(s)!=A.charAt(e))
        {
            return 0;
        }
        else
        {
        return palin(A,s+1,e-1);
        }
    }
}
