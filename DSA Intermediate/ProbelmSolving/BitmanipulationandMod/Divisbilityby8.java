/*
Divisibility by 8

You are given a number A in the form of a string. Check if the number is divisible by eight or not.

Return 1 if it is divisible by eight else, return 0.
*/

public class Solution {
    public int solve(String A) {

        int n=A.length();
        String substring="";
        

        //last 3 digits divisbily by 8 then number is divisible by 8
        if(n<=2)
        {
            substring=A.substring(0);
        }
        else
        {
            substring=A.substring(n-3);
        }

        int num=Integer.parseInt(substring);

        if(num%8==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }

        
    }
}
