/*
Are Matrices Same ?

You are given two matrices A & B of equal dimensions and you have to check whether two matrices are equal or not.

NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j in the given range.

*/


public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        int i,j;

        for(i=0;i<A.size();i++)
        {
            for(j=0;j<A.get(0).size();j++)
            {
                if(A.get(i).get(j)!=B.get(i).get(j))
                return 0;
            }
        }
        return 1;

    }
}
