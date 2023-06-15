/*
Josephus Problem

Given the total number of person A and a number B which indicates that B-1 persons are skipped and the Bth person is killed in a circle. Find the last person standing in the circle.

*/
public class Solution {
    public int solve(int A, int B) {
        if(A==1){return 1;}
        else
        {
        int x=solve(A-1,B);
        return (x+B-1)%A+1;
        }
    }
}
