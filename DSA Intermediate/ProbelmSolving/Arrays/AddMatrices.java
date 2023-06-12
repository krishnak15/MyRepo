/*
 Add the matrices

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.

*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        int i,j;
        ArrayList<ArrayList<Integer>> sumMatrix = new ArrayList<ArrayList<Integer>>();

        for(i=0;i<A.size();i++)
        {
            sumMatrix.add(new ArrayList<Integer>());
            for(j=0;j<A.get(0).size();j++)
            {
                sumMatrix.get(i).add(A.get(i).get(j)+B.get(i).get(j));
            }
        }
        return sumMatrix;

    }
}
