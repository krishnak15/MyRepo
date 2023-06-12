/*
Anti Diagonals

Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

*/

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {

        int i,j,k,n,counter;
        n=A.size();
        int rows=A.size();
        int columns=A.get(0).size();
        i=0;
        j=0;
        k=0;
        counter=0;
        int newRows=rows+columns-1;        
        ArrayList<ArrayList<Integer>> newArray=new ArrayList<ArrayList<Integer>>();

        //iniitializing new array elements with zero's.
        for(i=0;i<newRows;i++)
        {
            newArray.add(new ArrayList<Integer>());
            for(j=0;j<columns;j++)
            {
                newArray.get(i).add(0);
            }
        }
        rows=0;
        columns=0;
        
        j=0;
        //anti-diagonal array
        while(n>0)
        {
            j=0;
            i=counter;
            columns=counter;
            for(k=1;k<n;k++)
            {
                newArray.get(rows).set(columns,A.get(i).get(j));
                j++;
                rows++;          
            }

            for(k=1;k<=n;k++)
            {
                newArray.get(rows).set(columns,A.get(i).get(j));
                i++;
                rows++;         
            }

            n=n-1;
            counter++; 
            rows=counter;         
        }

        return newArray;

    }
}
