/*
Maximum positivity

Given an array of integers A, of size N.

Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

NOTE: It is guaranteed that an answer always exists.


*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
    
        int i=0,j=0,l=0,r=0,count=0;
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        ArrayList<Integer> subArrayLeft = new ArrayList<Integer>();
          ArrayList<Integer> subArrayRight = new ArrayList<Integer>();
        int n=A.size();

        for(i=0;i<n;i++)
        {

            if(A.get(i)<0)
            {
            l=0;
            subArrayLeft = new ArrayList<Integer>();
            for(j=0;j<=i-1;j++)
            {
                if(A.get(j)>0)
                {
                    l++;
                    subArrayLeft.add(A.get(j));
                }
                else
                break;
            }

            r=0;
            subArrayRight = new ArrayList<Integer>();
            for(j=i+1;j<n;j++)
            {
                if(A.get(j)>0)
                {
                    r++;
                    subArrayRight.add(A.get(j));
                }
                else
                break;
            }
            }
            if((l>r && l>subArray.size()) || (l==r && l>subArray.size()))
            {
                subArray = new ArrayList<Integer>();
                subArray.addAll(subArrayLeft);
                //subArray = subArrayLeft;
            }
            else if(r>l &&  r>subArray.size())
            {
                subArray = new ArrayList<Integer>();
                subArray.addAll(subArrayRight);
               // subArray = subArrayRight;
            }
            
        }

        return subArray;    
    
    }
}
