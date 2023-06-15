/*
Count Pair Sum
You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.

Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
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
            b=B-A.get(i);
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
