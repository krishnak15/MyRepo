/*
Set Bit

You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal.

*/

public class Solution {
    public int solve(int A, int B) {

       int num=0;
        if(A>B)
        {
            num=num|1;
       num = 1<<(A-B);
       num=num|1;
       num=num<<B;
}
else
{
    num=num|1;
    num = 1<<(B-A);
       num=num|1;
       num=num<<A;
}
       return num;


    }


}
