/*
Subarray with given sum
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single integer "-1".

First sub-array means the sub-array for which starting index in minimum.
*/
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int i=0;      
        long sum=0;
        int start=0,end=-1;
        int n=A.size();
        int count=0;
        long removesum;
        HashMap<Long,Integer> map=new HashMap<Long,Integer>();
        map.put(0l,-1);
        ArrayList<Integer> output=new ArrayList<Integer>();
        if(B<=0)
        {
        output.add(-1);
        return output;
        }
     
        for(i=0;i<n;i++)
        {
            sum=sum+A.get(i);
            removesum=sum-B;

            //if(removesum==0)
          //  {
               // start=0;
               // end=i;
           // }
            if(map.containsKey(removesum)){
                end=i;
                start=map.get(removesum);
                break;
            }
            map.put(sum,i);
        }
        if(end==-1)
        {
            output.add(-1);
        }
        else
        {
         for(i=start+1;i<=end;i++)
         {
                output.add(A.get(i));
         }
        }
         return output;
    }
}
