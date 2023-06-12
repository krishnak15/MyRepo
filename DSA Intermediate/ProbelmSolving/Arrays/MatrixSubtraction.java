/*
Matrix Subtraction

You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        int i,j;

        ArrayList<ArrayList<Integer>> subAB=new ArrayList<ArrayList<Integer>>();

        for(i=0;i<A.size();i++)
        {
            subAB.add(new ArrayList<Integer>());
            for(j=0;j<A.get(0).size();j++)
            {
                //subAB=A-B
                subAB.get(i).add(A.get(i).get(j)-B.get(i).get(j));

            }
        }

        return subAB;

    }
}
