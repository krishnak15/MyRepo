/*
 Matrix Scalar Product

 You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.

*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        int i,j;

        for(i=0;i<A.size();i++)
        {
            for(j=0;j<A.get(0).size();j++)
            {
                A.get(i).set(j,A.get(i).get(j)*B);
            }
        }

        return A;

    }
}
