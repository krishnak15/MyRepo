/*
 Range Sum Query

 You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        int i=0,startpoint=0,endpoint=0,k=0,l=0;
        ArrayList<Integer> prefixArray =new ArrayList<Integer>();
        ArrayList<Integer> outputArray = new ArrayList<Integer>();        
        
        //create a prefix sum array.
        for(i=0;i<A.size();i++)
        {
            if(i==0)
            prefixArray.add(A.get(i));
            else
            prefixArray.add(A.get(i) + prefixArray.get(i-1));

        }

        //query the sums and place to new array

        for(i=0;i<B.size();i++)
        {

            if(B.get(i).get(1) == B.get(i).get(0))
            {
                 outputArray.add(A.get(B.get(i).get(1) - 1));
            }
            else if(B.get(i).get(0) ==1)
            {
                outputArray.add(prefixArray.get(B.get(i).get(1) - 1));
            }
            else
            {
                k=prefixArray.get(B.get(i).get(1)-1);
                l=prefixArray.get(B.get(i).get(0)-2);
                outputArray.add(k-l)  ;
            }
        }
        
        return outputArray;

    }
}
