/*
 Subarrays with Bitwise OR 1

Given an array B of length A with elements 1 or 0. Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.

*/
public class Solution {
    public Long solve(int A, ArrayList<Integer> B) {

        long zeroSA=0;
        long count=0;
        for(int i=0;i<A;i++){
            if(B.get(i)==0){
                count=count+1;
            }else if(B.get(i)==1){
                zeroSA = zeroSA + (count*(count+1)/(long)2);
                count=0;
            }
            if(i==A-1 && count>0){
                zeroSA = zeroSA + (count*(count+1)/(long)2);
            }
        }

        return (((long)A*((long)A+1)/(long)2))-zeroSA;
    }
}
