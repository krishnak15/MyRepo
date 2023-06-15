/*

 Count distinct elements

You are given an array A of N integers. You will have to return number of distinct elements of the array.

*/
public class Solution {
    public int solve(ArrayList<Integer> A) {

HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int i, count=0;
        for(i=0;i<A.size();i++)
        {
            if (map.containsKey(A.get(i))) {
                count=map.get(A.get(i))+1;
                map.put(A.get(i),count);
            }
            else
            map.put(A.get(i),1);
        }
        return map.size();


    }
}
