/*

Christmas Trees

You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
The cost of these trees is Bp + Bq + Br.

You are to choose 3 trees such that their total cost is minimum. Return that cost.

If it is not possible to choose 3 such trees return -1.


*/

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

         int i=0,j=0,k=0,l=0,r=0,count=0,ans=Integer.MAX_VALUE,countl=0,countr=0;

        for (i=1;i<A.size();i++)
        {

            l=0;
            for(j=i-1;j>=0;j--)
            {
                if(A.get(j)>=A.get(i))
                {
                    continue;
                }
                l=B.get(j);
                countl++;
                 r=0;
                for(k=i+1;k<A.size();k++)
                {
                     if(A.get(k)<=A.get(i))
                {
                    continue;
                }
                    r=B.get(k);
                    countr++;
                    ans=Math.min(ans,l+r+B.get(i));

                }

            }

        }
        if(countl==0 || countr==0)
        {
            return -1;
        }
        else
        {
        return ans;
        }

    }
}
