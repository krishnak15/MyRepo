/*
Pair With Given Difference

Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.
*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
         int n=A.size();
        int a=0,b=0,i=0,c=0;
        long count=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(i=0;i<A.size();i++) {
            if(map.containsKey(A.get(i))){
                c=map.get(A.get(i))+1;
                map.put(A.get(i),c);
            }
            else{
                c=1;
            map.put(A.get(i),c);}
        }
        count=0;
        for(i=0;i<n;i++) {
            a=A.get(i);
            b=B+A.get(i);
            if(a!=b && map.containsKey(b)==true){
               return 1;
            }
            else if(a==b && map.get(a)!=null && map.get(a)>1) {
               return 1;
            }
        }
        return 0;
    }
}
