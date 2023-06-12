/* 

Best Time to Buy and Sell Stocks I

Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.

*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
          
           if(A.isEmpty())
            {
                return 0;
            }
         
            int i=0;
             /*
            int ans=0;   
            int min=A.get(A.size()-1);
            int max=A.get(A.size()-1);
            int maxi=A.size()-1;
            int mini=A.size()-1;
                   
            for (i=A.size()-1;i>=0;i--)
            {
                if(A.get(i)<min)
                {
                    min=A.get(i);
                    mini=i;

                }  
                if(A.get(i)>max)
                {
                    max=A.get(i);
                    maxi=i;
                }   

                if(maxi>=mini)
                {
                    ans=Math.max(ans,max-min);    
                }     
            }
            */

            int buy=A.get(0);
            int maxProfit=0;

            for(i=1;i<A.size();i++)
            {
                if(buy>A.get(i))
                {
                    buy=A.get(i);
                }
                else if(A.get(i)-buy>maxProfit)
                {
                    maxProfit = A.get(i)-buy;
                }
            }
            return maxProfit;       
    }
}
