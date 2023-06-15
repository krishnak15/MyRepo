/*
Count Pair Difference
You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.
*/
public class Solution {
    public int solve(int[] A, int k) {
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int pairCount = 0;
        for(int i : A){
            int p1 = i + k;
            boolean flag = false;
            if(i == p1) {
                flag = true;
            }
            if(map.containsKey(p1)){
                pairCount += map.get(p1);
            }
            int p2 = i - k;
            if(map.containsKey(p2) && !flag){
                pairCount += map.get(p2);
            }
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else{ 
                map.put(i, 1);
            }
        } 
        return pairCount;
    }
}
