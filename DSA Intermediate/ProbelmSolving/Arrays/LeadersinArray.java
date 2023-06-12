/*  
Leaders in an array

Given an integer array A containing N distinct integers, you have to find all the leaders in array A.

An element is a leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.


*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        int i,max,leader=1;
        ArrayList<Integer> leaderArray = new ArrayList<Integer>();

        max=A.get(A.size()-1);
        leaderArray.add(max);

        for(i=A.size()-2;i>=0;i--)
        {
            if(A.get(i)>max)            
            {
               max=A.get(i);
               
                leaderArray.add(max);
            }
        }

        return leaderArray;
    }
}
