/*
Multiple left rotations of the array

Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.

*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<ArrayList<Integer>> outputArray = new ArrayList<ArrayList<Integer>>();
       // ArrayList<Integer> tempArray = new ArrayList<Integer>();

       
        int n=A.size();
        int i,j,p,k,temp=0;

        k = 0;

         for(i=0;i<B.size();i++)
        {
            k=B.get(i)%A.size();
             ArrayList<Integer> tempArray = new ArrayList<Integer>();
              tempArray.addAll(A);
        //complete reverse 0 to size-1
        reverseArray(tempArray,0,A.size()-1);

        //reverse from 0 to k-1
        reverseArray(tempArray,0,n-k-1);

        //reverse from k to size-1
        reverseArray(tempArray,n-k,A.size()-1);
             outputArray.add(tempArray);
        }

        return outputArray;

    }


 public void reverseArray(ArrayList<Integer> partA,int P1,int P2)
    {
           int temp;
           
            while(P1<P2)
            {
                temp=partA.get(P1);
                partA.set(P1,partA.get(P2));
                partA.set(P2,temp);
                P1++;
                P2--;
            }
      
    }

}
