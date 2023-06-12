/*

Concatenate Three Numbers

Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.



*/


public class Solution {
    public int solve(int A, int B, int C) {

       int leastmin= Math.min(Math.min(A, B), C);
       int secondleast=0;
       int thirdleast=0;
       if(leastmin==A)
       {
           secondleast=Math.min(B,C);
           thirdleast=Math.max(B,C);
       }
      
         if(leastmin==B)
       {
           secondleast=Math.min(A,C);
           thirdleast=Math.max(A,C);
       }
     
        if(leastmin==C)
       {
           secondleast=Math.min(A,B);
           thirdleast=Math.max(A,B);
       }
       

  String ans=String.valueOf(leastmin)+String.valueOf(secondleast)+String.valueOf(thirdleast);

  return Integer.parseInt(ans);

    }
}
