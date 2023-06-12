/*
Subarray in given range

Given an array A of length N, return the subarray from B to C.

*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {

            int i=0;
            ArrayList<Integer> subArray = new ArrayList<Integer>();

            for(i=B;i<=C;i++)
            {
               subArray.add(A.get(i));
            }
        return subArray;
    }
}
