/*
Special Index

Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int i,count=0,n,lefteven,leftodd,righteven,rightodd;
            ArrayList<Integer> psOdd = new ArrayList<Integer>();
            ArrayList<Integer> psEven = new ArrayList<Integer>();
           
            psOdd.add(0);
            psEven.add(A.get(0));
            for(i=1;i<A.size();i++)
            {
                if(i%2==0)
                {
                    psEven.add(psEven.get(i-1)+A.get(i));
                    psOdd.add(psOdd.get(i-1));
                }
                else
                {
                    psEven.add(psEven.get(i-1));
                    psOdd.add(psOdd.get(i-1)+A.get(i));
                }
            }
            n=A.size();

            //for i=0
            if((psEven.get(n-1)-psEven.get(0))==(psOdd.get(n-1)-psOdd.get(0)))
            {
                count++;
            }
            for(i=1;i<A.size();i++)
            {

               //0 to i-1
               lefteven=psEven.get(i-1);
               leftodd=psOdd.get(i-1);
               //n-1 to i
                righteven=psEven.get(n-1)-psEven.get(i);
                rightodd=psOdd.get(n-1)-psOdd.get(i);

               if(lefteven+rightodd == righteven+leftodd)
                     count++;
               
            }

        return count;
    }
}
