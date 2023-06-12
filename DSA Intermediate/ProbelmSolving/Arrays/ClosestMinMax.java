/*
Closest MinMax

Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.

*/



public class Solution {
    public int solve(ArrayList<Integer> A) {

        int i,max,min,maxi,mini,ans;

        min=A.get(0);
        max=A.get(0);
        
        //find min, max
        for(i=0;i<A.size();i++)
        {
                if(A.get(i)>max)
                {
                    max=A.get(i);
                }

                if(A.get(i)<min)
                {
                    min=A.get(i);
                }

        }

        ans = A.size();
        mini=-1;
        maxi=-1;
        //write mini, maxi, iterate
        for(i=0;i<A.size();i++)
        {
            if(A.get(i)==min)
            {
                if(maxi!=-1)
                {
                    ans=Math.min(ans,i-maxi+1);
                }
                mini=i;

            }

            if(A.get(i)==max)
            {
                if(mini!=-1)
                {
                    ans=Math.min(ans,i-mini+1);
                }
                maxi=i;

            }

        }

        return ans;

    }
}
