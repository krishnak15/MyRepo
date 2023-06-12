/*
Subarray with least average

Given an array of size N, find the subarray of size K with the least average.

*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

       int i,j,sum=0,ans=0,n=A.size(),indexi=0;

        if(n==1)
        {
            sum=A.get(0);
               ans=1;
               indexi=0;
           
        }
        for(i=0;i<B;i++)
        {
            sum=sum+A.get(i);
        }
        ans=sum;


        for(j=1;j<A.size() && j+B-1<A.size();j++)
        {
           
            sum=sum+A.get(j+B-1)-A.get(j-1);
           
                if(ans>sum)
                {
                    sum=ans;
                    indexi=j;
                }
                
          
         
            

        }
        
            return indexi;       

    }
}
