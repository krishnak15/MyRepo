/*
Subarray with given sum and length

Given an array A of length N. Also given are integers B and C.

Return 1 if there exists a subarray with length B having sum C and 0 otherwise

*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B, int C) {

        int i,j,sum=0,ans=0,n=A.size();

        if(n==1)
        {
            sum=A.get(0);
            if(sum==C)
            {
                ans=1;
            }
        }
        for(i=0;i<B;i++)
        {
            sum=sum+A.get(i);
        }



        for(j=1;j<A.size() && j+B-1<A.size();j++)
        {
           
            sum=sum+A.get(j+B-1)-A.get(j-1);
            if(sum==C)
            {
                ans= 1;
                
            }
         
            

        }
        
            return ans;       

    }
}
