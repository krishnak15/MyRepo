/*
Product array puzzle

Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.

*/



public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {


        int i;

        ArrayList<Integer> prefixArray = new ArrayList(A.size());
        ArrayList<Integer> suffixArray = new ArrayList(Arrays.asList(new Integer[A.size()]));
        ArrayList<Integer> productArray = new ArrayList(A.size());

        for(i=0;i<A.size()-1;i++)
        {
            suffixArray.add(1);
        }


        //prefix ArrayList
        for(i=0;i<A.size();i++)
        {
            if(i==0)
            {
                prefixArray.add(i,1);
            }
            else
            {
                prefixArray.add(i,prefixArray.get(i-1)*A.get(i-1));
            }
        }

        //Suffix ArrayList
       for(i=A.size()-1;i>=0;i--)
        {
            if(i==A.size()-1)
            {
                suffixArray.set(A.size()-1,1);
            }
            else
            {
                suffixArray.set(i,suffixArray.get(i+1)*A.get(i+1));
            }
        }

        //product ArrayList
         
       for(i=0;i<A.size();i++)
        {
            productArray.add(i,prefixArray.get(i)*suffixArray.get(i));

        }

        return productArray;
    }
}
