/*  

Time to Equality

Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.

*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int rTimetoEquality=0;
        int i;
        int maxElement=A.get(0);

        //Find Max element

            for(i=1;i<A.size();i++)
            {
                if(A.get(i)>maxElement)
                    maxElement=A.get(i);

            }


        //Add to make each element same as max, calculate the added values
         for(i=0;i<A.size();i++)
            {
                
                    rTimetoEquality= rTimetoEquality +( maxElement-A.get(i));
                    
            }


        return rTimetoEquality;

    }
}
