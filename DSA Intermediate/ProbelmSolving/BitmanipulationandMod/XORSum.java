/*
XOR Sum

Given two integers A and B. Find the minimum value (A ⊕ X) + (B ⊕ X) that can be achieved for any X.

where P ⊕ Q is the bitwise XOR operation of the two numbers P and Q.


*/

public class Solution {
    public int solve(int A, int B) {

        int i;
        int x;
        int ans=Integer.MAX_VALUE;

       // for(i=0;i<=A*B;i++)
      //  {
           ans= Math.min(ans,(A^0 + B^0));
       // }

        return ans;
    }
}
