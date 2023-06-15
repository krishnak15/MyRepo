/*
 Frequency of element query

Given an array A. You have some queries given by the array B.

For the i-th query, find the frequency of B[i] in the array A.


*/
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Integer> C= new ArrayList<Integer>();
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
        int Freq=0;
        for(i=0;i<B.size();i++)
        {
        if (map.containsKey(B.get(i))) {
         Freq=map.get(B.get(i));
            C.add(Freq);
        }
        else
        C.add(0);
        }
        return C;
    }

}
