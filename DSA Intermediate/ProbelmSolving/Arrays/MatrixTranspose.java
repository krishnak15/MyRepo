/*
Matrix Transpose

You are given a matrix A, you have to return another matrix which is the transpose of A.

*/


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        int i,j,rows=A.size(),temp,columns=A.get(0).size();
        int arows=0,acolumns=0;
        i=0;
        j=columns-1;
        ArrayList<ArrayList<Integer>> rectTranspose = new ArrayList<ArrayList<Integer>>();

            i=0;
            j=0;
            for(i=0;i<columns;i++)            
            {
                 rectTranspose.add(new ArrayList<Integer>());

                for(j=0;j<rows;j++)
                {
                    rectTranspose.get(i).add(A.get(j).get(i));
                    
                }
                
            }

            return rectTranspose; 

    }
}
