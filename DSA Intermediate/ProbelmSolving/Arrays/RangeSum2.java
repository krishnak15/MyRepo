/*
Range Sum Query

You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

*/

public class Solution {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
       
       ArrayList<Long> outputArray = new ArrayList<Long>();
       ArrayList<Long> prefixArray = new ArrayList<Long>();
       //ArrayList<Long> longArray=new ArrayList<Long>;
int i;
long k,l;
       ArrayList<Long> longArray = new ArrayList<Long>();
       int nInts = A.size();
//List<Long> longs = new ArrayList<Long>(nInts);
for (i=0;i<nInts;++i) {
    longArray.add(A.get(i).longValue());
}


//create a prefix sum array.
        for(i=0;i<longArray.size();i++)
        {
            if(i==0)
            prefixArray.add(longArray.get(i));
            else
            prefixArray.add(longArray.get(i) + prefixArray.get(i-1));

        }

        //query the sums and place to new array

        for(i=0;i<B.size();i++)
        {

            if(B.get(i).get(1) == B.get(i).get(0))
            {
                 outputArray.add(longArray.get(B.get(i).get(1) - 1));
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
