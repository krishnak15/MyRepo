/*
 Count Increasing Triplets

You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]

*/

public class Solution {
    public int solve(ArrayList<Integer> A) {

            int j,i,k,count=0,left,right;
            int n=A.size();

            for(j=1;j<n-1;j++)
            {

                    //lefts
                    left=0;
                    for(i=j-1;i>=0;i--)
                    {
                        if(A.get(i)<A.get(j))
                            left++;

                    }

                    //rights
                    right=0;
                    for(k=j+1;k<n;k++)
                    {
                        if(A.get(k)>A.get(j))
                            right++;

                    }

                    count += left*right;


            }

        return count;

    }
}
