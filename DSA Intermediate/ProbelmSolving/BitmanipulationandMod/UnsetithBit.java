/*

Unset i-th bit

You are given two integers A and B.
If B-th bit in A is set, make it unset
If B-th bit in A is unset, leave it as it is
Return the updated A value

*/


public class Solution {
    public int solve(int A, int B) {
        int num=(int)Math.pow(2,B);
        int unSetnum=(~num);
        
        return A&unSetnum;

       
    }
}
