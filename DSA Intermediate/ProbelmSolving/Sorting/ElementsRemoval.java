/*
Elements Removal

Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.

*/
public class Solution {
    public int solve(ArrayList<Integer> A) {

        int i=0;
        int n=A.size();
        int ans=0;
        Collections.sort(A,Collections.reverseOrder());
        for(i=0;i<n;i++)
        {
            ans = ans + A.get(i)*(i+1); 
        }

        return ans;
    }
}
