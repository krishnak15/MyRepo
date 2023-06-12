/*
In-place Prefix Sum
Given an array A of N integers. Construct prefix sum of the array in the given array itself.
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        int i;

        ArrayList<Integer> preFixArray = new ArrayList<Integer>();
        
        for (i=0;i<A.size();i++)
        {
            if(i==0)
            preFixArray.add(A.get(i));
            else
            preFixArray.add(i,preFixArray.get(i-1) + A.get(i));

        }

        return preFixArray;    
    
    }

}
