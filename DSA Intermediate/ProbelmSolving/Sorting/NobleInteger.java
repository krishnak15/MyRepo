/*
Noble Integer

Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.

*/

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int i=0;
        int n=A.size();
        int ans=0;
        int count=0;
        Collections.sort(A,Collections.reverseOrder());

        if(A.get(0)==0)
            return 1;

        for(i=1;i<n;i++)
        {

            if(A.get(i)!=A.get(i-1))
            {
                count=i;
            }

            if(count==A.get(i))
            {
                return 1;
            }

        }

        return -1;


    }
}
