/*

Spiral Order Matrix II

Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.

*/

public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {

        int i,j,num=0,n=A,k;
        ArrayList<ArrayList<Integer>> spiralArray=new ArrayList<ArrayList<Integer>>();
        
        for(i=0;i<A;i++)
        {
            spiralArray.add(new ArrayList<Integer>());
            for(j=0;j<A;j++)
            {
                spiralArray.get(i).add(0);

            }
        }

        i=0;
        j=0;
        num=1;
        while(n>0)
        {
        for(k=0;k<n-1;k++)
        {
            spiralArray.get(i).set(j,num++);
            j++;
        }

         for(k=0;k<n-1;k++)
        {
            spiralArray.get(i).set(j,num++);
            i++;
        }

        for(k=0;k<n-1;k++)
        {
            spiralArray.get(i).set(j,num++);
            j--;
        }

         for(k=0;k<n-1;k++)
        {
            spiralArray.get(i).set(j,num++);
            i--;
        }
            n=n-2;
            i++;
            j++;
            
            
    }
    if(n==-1)
    {
        i--;
        j--;
        spiralArray.get(i).set(j,num++);
    }

  
        return spiralArray;

    
    }
}
