/*
First Repeating element

Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
     //   ArrayList<Integer> C= new ArrayList<Integer>();
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
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
           
            if(mapElement.getValue()>1)
            return mapElement.getKey();
        }

        return -1;
    }

}
