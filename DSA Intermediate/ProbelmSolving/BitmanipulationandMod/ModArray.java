/* Mod Array
Problem Description
You are given a large number in the form of a array A of size N where each element denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.



Problem Constraints
1 <= N <= 105
0 <= Ai <= 9
1 <= B <= 109


*/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
    long power=1,ans=0;
long number=0;
        int i=0;
       
        for(i=A.size()-1;i>=0;i--)
        {
            if(i==A.size()-1)
            {
            power=1;
            }
            else
            {
            power=(10*power)%B;
            }
            number=((power%B)*(A.get(i)%B))%B;
            ans=(ans%B+number%B)%B;

        }

        return (int)ans;

    }
}
