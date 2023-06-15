/*
 Is magic?

Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic number.

*/

public class Solution {
    public int solve(int A) {
        int i;

        i=magicNumber(A);
        if(i!=1)
        {
            return 0;
        }
        else
        return 1;
    }
    public int magicNumber(int A)
    {
         A=A/10+(A%10);
        if(A<=9){
            return A;
        }
        else
         return  magicNumber(A); 
        
    }
}
