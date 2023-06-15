/*
 Subsequence-Sum Problem
 You are given an array of integers of N size.

You have to find that there is any subsequence exists or not whose sum is equal to B.
*/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
        int i=0;
        int j=0;         
        int sum=0;
        int n=A.size();
        for(i=0;i<Math.pow(2,n);i++)
        {
            sum=0;
            for( j=0;j<n;j++)
            {                
                    if(checkBit(i,j,n))
                    sum=sum+A.get(j);
            }
            if(sum==B)
            return 1;
        }
       
        return 0;
    }
 

    public boolean checkBit(int num,int bitn,int n)
    {
        String bin=Integer.toBinaryString(num);
        while(bin.length()<n)
        {
            bin='0'+bin;
        }
        if(bin.charAt(bitn)=='0')
            return false;
        else
            return true;
    }
    
}
