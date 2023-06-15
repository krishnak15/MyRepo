/*
 Sub-array with 0 sum

Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
    
     HashSet<Long> set=new HashSet();
        ArrayList<Long> C= new ArrayList<Long>();
        int i, count=0;
        C.add((long)A.get(0));
        for(i=1;i<A.size();i++)
        {
           C.add((long)A.get(i)+C.get(i-1));
        }
            
        for(i=0;i<C.size();i++)
        {
         if (C.get(i)==0) {
             return 1;
         }
         else
         {
             if(set.contains(C.get(i)))
             {
                 return 1;
             }
             else
             {
             set.add((long)C.get(i));
             }
         }
        }
      return 0;
}
}
