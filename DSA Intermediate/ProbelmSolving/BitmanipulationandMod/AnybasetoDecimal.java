/*
Any base to decimal

You are given a number A. You are also given a base B. A is a number on base B.
You are required to convert the number A into its corresponding value in decimal number system.


*/

public class Solution {
    public int solve(int A, int B) {

        int num=0,i;
        int firstNum;
        firstNum=A;
        for(i=0;firstNum>0;i++)
        {
            
            num=num + (firstNum%10)*(int)Math.pow(B,i);
            firstNum=firstNum/10;
        }

return num;

    }
}
