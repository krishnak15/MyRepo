/* 
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.

*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        B=B%(A.size());

        //complete reverse 0 to size-1
        reverseArray(A,0,A.size()-1);

        //reverse from 0 to B-1
        reverseArray(A,0,B-1);

        //reverse from B to size-1
        reverseArray(A,B,A.size()-1);

        return A;

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

       // return partA;
    }

}
