/*

Generate all subarrays

You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array


*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        
        int s,e,n,i;
        n=A.size();

        ArrayList<ArrayList<Integer>> suArryList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempArray= new ArrayList<Integer>();

        for(s=0;s<n;s++)
        {
            for(e=s;e<n;e++)
            {
               tempArray=new ArrayList<Integer>();
                for(i=s;i<=e;i++)
                {
                    tempArray.add(A.get(i));
                }                
                suArryList.add(tempArray);                
            }
        }

        return suArryList;
    }
}
