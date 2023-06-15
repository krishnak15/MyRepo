/*
 Pairs With Given Xor

Given an integer array A containing N distinct integers.

Find the number of unique pairs of integers in the array whose XOR is equal to B.

NOTE:

Pair (a, b) and (b, a) is considered to be the same and should be counted once.
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
            b=B^A.get(i);
            if(a!=b && map.containsKey(b)==true){
                count=(count%1000000007+(map.get(a)*map.get(b))%1000000007);
                map.remove(a);
                map.remove(b);
            }
            else if(a==b && map.get(a)!=null && map.get(a)>1) {
                count=(count%1000000007+(map.get(a)-1)%1000000007);
                map.put(a,map.get(a)-1);
               // map.remove(a);
            }
        }
        return (int)(count%1000000007);
    }
}
