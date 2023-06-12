/*
 Leap year? - III

 Given an integer A representing a year, Return 1 if it is a leap year else, return 0.

A year is a leap year if the following conditions are satisfied:

The year is multiple of 400.
or the year is multiple of 4 and not multiple of 100.

*/

public class Solution {
    public int solve(int A) {

        if(A%400==0)
        return 1;

        if((A%4==0)&&(A%100!=0))
        return 1;
        else
        return 0;
    }
}
