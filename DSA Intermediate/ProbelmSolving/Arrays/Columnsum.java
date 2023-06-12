/*
Column sum

You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        int i,j,sum=0;
        ArrayList<Integer> columnSum=new ArrayList<Integer>();
        for(j=0;j<A.get(0).size();j++)
        {
            sum=0;
            for(i=0;i<A.size();i++)
            {
                sum =  sum + A.get(i).get(j);
            }
            columnSum.add(sum);
        }

        return columnSum;
    }
}
