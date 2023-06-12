/*
Row Sum

You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.

*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        int i,j,sum=0;
        ArrayList<Integer> rowSum=new ArrayList<Integer>();

        for(i=0;i<A.size();i++)
        {
            sum=0;
            for(j=0;j<A.get(0).size();j++)
            {
                sum = sum +A.get(i).get(j);
            }
            rowSum.add(sum);
        }

        return rowSum;
    }
}
