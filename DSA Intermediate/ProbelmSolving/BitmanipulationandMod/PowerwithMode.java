/*
Power with Modules


You are given A, B and C .
Calculate the value of (A ^ B) % C


*/
public class Solution {
    public int solve(int A, int B, int C) {
        int i=1;
        long ans=1;
        if(B==0)
        {
            return (1%C);
        }
        for(i=1;i<=B;i++)
        {
            ans=((ans%C)*(A%C))%C;
        }

        return (int)(ans%C);
    }
}
