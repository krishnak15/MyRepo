/*
Row to Column Zero

You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.

*/


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        int i,j,row,column;
        ArrayList<ArrayList<Integer>> rowColumnZero=new ArrayList<ArrayList<Integer>>();
       
        for(i=0;i<A.size();i++)
        {
            rowColumnZero.add(new ArrayList<Integer>());
            for(j=0;j<A.get(0).size();j++)
            {               
               rowColumnZero.get(i).add(A.get(i).get(j));              
                
            }
        }

        for(i=0;i<A.size();i++)
        {            
            for(j=0;j<A.get(0).size();j++)
            {               
                if(A.get(i).get(j)==0)
                {
                    makeRowColumnZero(i,j,rowColumnZero);
                } 
            }
        }

        return rowColumnZero;
    }


    public void  makeRowColumnZero(int rows,int columns,ArrayList<ArrayList<Integer>> rowColumnZero)
    {
        int x,y;
        
        //Rows zero
        for(y=0;y<rowColumnZero.get(0).size();y++)        
        {      
            rowColumnZero.get(rows).set(y,0);
        }

        //Column zero
         for(x=0;x<rowColumnZero.size();x++)
        {
            rowColumnZero.get(x).set(columns,0);
        }

    }
}
