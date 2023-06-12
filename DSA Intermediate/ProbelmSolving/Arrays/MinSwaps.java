/*
 Minimum Swaps

 Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.

*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

       int i,j,k,goodElements=0,badelements=0;
        int n=A.size(),ans=0;

        //find tne number of elements less than or equal to B 
        for(i=0;i<n;i++)
        {
            if(A.get(i)<=B)
                goodElements++;
        }
        //check subarrays of that length with elements having good elements or bad element.
            for(i=0;i<goodElements;i++)
            {
                //check first set of subarray if there are any badelement
                if(A.get(i)>B)
                {
                    badelements++;
                }
                ans=badelements;
            }
            if(badelements==0)
            {
                return 0;
            }
            else
            {

                for(j=1;j<n && j+goodElements-1<n;j++)
                {

                        if(A.get(j-1)>B)
                        {
                            badelements--;
                        }
                        if(A.get(j+goodElements-1)>B)
                        {
                            badelements++;
                        }   
                        ans=Math.min(ans,badelements);               
                   
                }     
                

            }
           
        return ans;    

    }  

    
}
