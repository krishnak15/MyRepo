/* 
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
Problem Constraints
1 <= A.size() <= 104
1 <= A[i] <= 109
1 <= B <= 109

Input Format
First argument is an integer array A.
Second argument is an integer B.



*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        int i,j;
        for(i=0;i<A.size();i++)
        {
            for(j=0;j<i;j++)
            {
                if(A.get(i)+A.get(j) == B && i!=j)
                 return 1;
            }
        }
                
        return 0;
    }
}
