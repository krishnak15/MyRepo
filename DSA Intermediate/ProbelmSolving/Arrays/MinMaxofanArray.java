/* 
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int max=A.get(0),min=A.get(0),i;


        for(i=0;i<A.size();i++)
        {

        if(A.get(i)>max)
        max=A.get(i);

        if(A.get(i)<min)
        min=A.get(i);

        }

        return min+max;

    }
}
