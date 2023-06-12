/*  

Pick from both sides!

You are given an integer array A of size N.

You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.

Find and return this maximum possible sum.

*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {


          int i;
            int n=A.size();

            ArrayList<Integer> forwardSumArray = new ArrayList<Integer>();
            ArrayList<Integer> backwardSumArray = new ArrayList<Integer>(Arrays.asList(new Integer[n]));
         

            int maxSum=Integer.MIN_VALUE;

            forwardSumArray.add(A.get(0));
            for(i=1;i<=n-1;i++)
            {
                 forwardSumArray.add(A.get(i)+forwardSumArray.get(i-1));
            }
            backwardSumArray.set(n-1,A.get(n-1));
            
            for(i=n-2;i>=0;i--)
            {
                 backwardSumArray.set(i,backwardSumArray.get(i+1)+A.get(i));
            }
           
            for(i=0;i<=B;i++)
            {
                if(i==0)
                {
                     maxSum=Math.max(maxSum,  backwardSumArray.get(n-B));
                }
                else if(i==B)
                {
                     maxSum=Math.max(maxSum,  forwardSumArray.get(B-1));
                }
                else
                {
                maxSum=Math.max(maxSum,  forwardSumArray.get(i-1) + backwardSumArray.get(n-B+i)) ;
                }
            }

            return maxSum;
    }
}
