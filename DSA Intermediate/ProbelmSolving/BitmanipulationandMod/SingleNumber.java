/*
Single Number

Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {

        int i=0;
        int outnum=A.get(0);

        for(i=1;i<A.size();i++)
        {
            outnum=outnum^A.get(i);
        }

        return outnum;

    }
}
