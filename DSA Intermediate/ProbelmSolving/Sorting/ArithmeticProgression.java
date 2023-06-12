/*
Arithmetic Progression?

Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        int i=0,diff=0;
        if(A.size()>1)
        diff=A.get(i)-A.get(i+1);
        for(i=0;i<A.size()-1;i++)
        {
            if((A.get(i)-A.get(i+1)) != diff)
            {
                return 0;
            }

        }
        return 1;

    }
}
