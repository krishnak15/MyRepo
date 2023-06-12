/*

Main Diagonal Sum

You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {

        int sum=0,i;
        for(i=0;i<A.size();i++)
        {
            sum=sum + A.get(i).get(i);
        }
        return sum;
    }
}
