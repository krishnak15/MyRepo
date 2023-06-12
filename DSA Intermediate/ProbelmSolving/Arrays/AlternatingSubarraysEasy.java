/*
Alternating Subarrays Easy

You are given an integer array A of length N comprising of 0's & 1's, and an integer B.

You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.

A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.
*/
public class Solution {
    public int[] solve(int[] A, int B) {  int i,j,p,k,size=2*B+1;
        int SA[]=new int[size];
        int ind[]=new int[A.length];
        for(i=0;i<A.length;i++)
        {
            k=0;
            j=i;
            for(p=0;p<size;p++)
            {
                if(j<A.length)
                {
               SA[k]=A[j];
               k++;
               j++;
                }
            }
            System.out.println(Arrays.toString(SA));
            if(isAlternate(SA)==1)
            ind[i]=B+i;
        }
        return ind;
    }
      public  int isAlternate(int[] A)
    {
        int i,C=0,prev=-1;
        if(A.length==1)
        {
            C=1;
        }
        else
            {
            for(i=0;i<A.length-1;i++)
            {
                 if(i==0)
                 {
                   if(A[i]!=A[i+1])
                   {
                   C=1 ;
                   prev=1;
                   }
                   else
                   {
                     C=0;
                     prev=0;
                   }
                 }  
                else if(A[i]!=A[i+1] && prev==1)
                {
                        prev=1;
                        C=1;
                }
                else
                {
                    prev=0;
                    C=0;
                }
            }
            }
     return C;
   
}
}
