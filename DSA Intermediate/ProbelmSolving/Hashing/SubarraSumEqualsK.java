/*
Subarray Sum Equals K
Given an array of integers A and an integer B.

Find the total number of subarrays having sum equals to B.
*/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int i=0;      
        int sum=0;
        int n=A.size();
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,1);
        //ArrayList<Integer> output=new ArrayList<Integer>();
    
        for(i=0;i<n;i++)
        {
            sum=sum+A.get(i);
            int removesum=sum-B;


            if(map.containsKey(removesum)){
               
                count=count+map.get(removesum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
       
         return count;

    }
}
