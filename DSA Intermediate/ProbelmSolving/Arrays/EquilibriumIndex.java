/*
Equilibrium index of an array

You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

*/




public class Solution {
    public int solve(ArrayList<Integer> A) {

          int i=0;
         int sumLeft=0,sumRight=0;
        ArrayList<Integer> prefixArray =new ArrayList<Integer>();
        
        //create a prefix sum array.
        for(i=0;i<A.size();i++)
        {
            if(i==0)
            prefixArray.add(A.get(i));
            else
            prefixArray.add(A.get(i) + prefixArray.get(i-1));
        }

        //if complete arrya is zero , equilibrium index is at last.
         if(prefixArray.get(A.size()-1)==0)
            return (A.size()-1);

        for(i=0;i<A.size();i++)
        {
            if(i==0)
            {
                //For first element, since its start we take sum as 0 as no elments are before first.
                sumLeft=0;
                sumRight=prefixArray.get(A.size()-1);
            }
            else
            {
                 sumLeft=prefixArray.get(i-1);
            }
           
            sumRight=prefixArray.get(A.size()-1) - prefixArray.get(i);

            if(sumLeft==sumRight)
            {
                return i;
            }
        }       

        return -1;

    }
}
