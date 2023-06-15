/*
Longest Subarray Zero Sum

Given an array A of N integers.

Find the length of the longest subarray in the array which sums to zero.
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
      
        HashMap<Long,Integer> set=new HashMap();
        ArrayList<Long> C= new ArrayList<Long>();
        int i, count=0,max=0;
        C.add((long)A.get(0));
        for(i=1;i<A.size();i++)
        {
           C.add((long)A.get(i)+C.get(i-1));
        }
            
        for(i=0;i<C.size();i++)
        {
         if (C.get(i)==0) {
             max= Math.max(max,i+1);
         }
         else
         {
             if(set.containsKey(C.get(i)))
             {
                // System.out.println("previous index"+set.get(C.get(i)));
                 max=Math.max(max,i+1-set.get(C.get(i)));
             }
             else
             {
             set.put((long)C.get(i),i+1);
             }
         }
        }
        if(max>0)
        return max;
        else
      return 0;   

    }
}
