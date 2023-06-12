/*
Decimal to Any Base

Given a decimal number A and base B.
You are required to change the decimal number A into the corresponding value in base B and return that.

*/

public class Solution {
    public int DecimalToAnyBase(int A, int B) {

        int num=A;

        int i,outputnum=0;

        for(i=0;num>0;i++)
        {
            outputnum+=(num%B)*(int)Math.pow(10,i);
            num=num/B;
        }

        return outputnum;

    }
}
