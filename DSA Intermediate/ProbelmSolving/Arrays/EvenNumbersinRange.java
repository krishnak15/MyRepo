/*
 Even numbers in a range

You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
*/
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {


             ArrayList<Integer> evenOdd = new ArrayList<Integer>();
             int i,k=0,l=0;
             ArrayList<Integer> prefixArray = new ArrayList<Integer>();
             ArrayList<Integer> outputArray = new ArrayList<Integer>();   
    //evenodd array creation
             for(i=0;i<A.size();i++)
             {
                if(A.get(i)%2==0)
                    evenOdd.add(1);
                else
                    evenOdd.add(0);
             }

    // even odd prefix array creation
            for(i=0;i<A.size();i++)
            {
                if(i==0)
                  prefixArray.add(evenOdd.get(i));
                 else
                  prefixArray.add(evenOdd.get(i) + prefixArray.get(i-1));
            }

    //query the even numbers
    for(i=0;i<B.size();i++)
        {

            if(B.get(i).get(0)==0)
            {
                outputArray.add(prefixArray.get(B.get(i).get(1)));
            }
            else
            {              
                    k=prefixArray.get(B.get(i).get(1));
                    l=prefixArray.get(B.get(i).get(0)-1);
                    outputArray.add(k-l)  ;
            
            
            }
        }
        
        return outputArray;

    }
}
