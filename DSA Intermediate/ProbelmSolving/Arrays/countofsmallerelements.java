
//Given an array A of N integers. Count the number of elements that have at least 1 elements greater than itself.

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int countGreater=0,i;
        int maxElement=A.get(0);

        for(i=0;i<A.size();i++)
        {
            if(maxElement<A.get(i))
            maxElement = A.get(i);
        }

        for(i=0;i<A.size();i++)
        {
            if(A.get(i)==maxElement)
                countGreater++;
        }

        return A.size()-countGreater;

    }
}
