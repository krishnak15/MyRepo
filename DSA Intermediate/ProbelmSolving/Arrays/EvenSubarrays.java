/*
Even Subarrays

You are given an integer array A.

Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.

Return "YES" if it is possible; otherwise, return "NO" (without quotes).
*/


public class Solution {
    public String solve(ArrayList<Integer> A) {

        int i;
        String evenArray="NO";
        //check if even length.

       // if(A.size()==2 && A.get(0)%2==0 && A.get(1)%2==0)
      //  {
      //      return "YES";
     //   }
       
        if(A.size()%2!=0 || A.get(0)%2!=0 || A.get(A.size()-1)%2 !=0)
         evenArray= "NO";
         else
         evenArray = "YES";
      //  else
      //  {
      //      for(i=1;i<A.size()-1;i++)
     //       {
            //see 2 continuous elements are even and should be able to divide the array there.
     //       if(A.get(i)%2==0 && A.get(i+1)%2==0 && i%2!=0)
     //           evenArray= "YES";
          
      //      }
     //   }
        return evenArray;

    }
}
