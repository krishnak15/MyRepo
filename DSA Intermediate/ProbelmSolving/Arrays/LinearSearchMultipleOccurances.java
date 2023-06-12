/* 

Given an array A and an integer B, find the number of occurrences of B in A.

*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        int i,count=0;

        for(i=0;i<A.size();i++)
        {
            if(A.get(i)==B)
            count++;

        }

        return count;
    }
}
