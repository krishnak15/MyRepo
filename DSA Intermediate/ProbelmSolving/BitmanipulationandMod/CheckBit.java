/*

 Check bit

 You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset

*/

public class Solution {
    public int solve(int A, int B) {

        if(((A>>B)&1)==1)
        {
            return 1;
        }
        else
        return 0;

    }
}
