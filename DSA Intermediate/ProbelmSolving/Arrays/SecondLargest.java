
/*You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists. */

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int max,max2,i,count=0;
        max=A.get(0);
        max2=0;
        
        //Loop to find max number

        for(i=0;i<A.size();i++)
        {
            if(A.get(i)>max)
            max=A.get(i);
        }

        //Loop to find second max number
        for(i=0;i<A.size();i++)
        {                        
            if(A.get(i)>max2 && A.get(i)<max)
            {
                 max2=A.get(i);
                 count++;
            }                

        }

      if(count>0)
      return max2;
      else
      return -1;

    }
}
