/*
Interesting Array

You have an array A with N elements. We have two types of operation available on this array :
We can split an element B into two elements, C and D, such that B = C + D.
We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
You have to determine whether it is possible to convert array A to size 1, containing a single element equal to 0 after several splits and/or merge?

*/


public class Solution {
    public String solve(ArrayList<Integer> A) {

        int n=A.size(),i;
        int element=0;
        String output="No";

        if(n<2)
        return "No";
        else
        {
            element=A.get(0);
            for(i=1;i<n;i++)
            {
                element=element^A.get(i);
            }
            if(element%2==0)
            {
                return "Yes";
            }
        }
        return output ;
    }
}
