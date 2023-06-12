/*
Sum of even indices

You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing


*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

            int i,s,e;
            ArrayList<Integer> psEven = new ArrayList<Integer>();
            ArrayList<Integer> ansArray=new ArrayList<Integer>();

            psEven.add(A.get(0));

            for(i=1;i<A.size();i++)
            {
                if(i%2==0)
                {
                    psEven.add(psEven.get(i-1)+A.get(i));
                }
                else
                {
                    psEven.add(psEven.get(i-1));
                }
            }

            for(i=0;i<B.size();i++)
            {
                //e-(s-1)
                e=B.get(i).get(1);
                s=B.get(i).get(0);
                if(s==0)
                {
                    ansArray.add(psEven.get(e));
                }
                else
                {
                ansArray.add(psEven.get(e)-psEven.get(s-1));
                }
            }

            return ansArray;
    }
}
