/*
Minor Diagonal Sum

You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).

*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {

        int i,j,sum=0;

        for(i=0,j=A.size()-1;i<A.size() && j>=0;i++,j--)
        {
            sum =sum +A.get(i).get(j);
        }
        return sum;

    }
}
