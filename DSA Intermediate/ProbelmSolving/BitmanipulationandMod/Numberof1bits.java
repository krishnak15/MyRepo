/*
Number of 1 Bits

Write a function that takes an integer and returns the number of 1 bits it has.

*/


public class Solution {
    public int numSetBits(int A) {

        int count=0;
        if((A&1)==1)
        count++;
        while(A>0){

            if(((A>>1) &1) ==1)
            count++;

            A=A>>1;
        }

        return count;
    }
}
