/* 

Given an array A of N integers. Also given are two integers B and C. Reverse the array A in the given range [B, C]
Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
C = 3
Input 2:

A = [2, 5, 6]
B = 0
C = 2

Example Output
Output 1:

[1, 2, 4, 3]
Output 2:

[6, 5, 2]


*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {

        int temp=0;
        
        while(B<C)
        {
           
            temp=A.get(B);
            A.set(B,A.get(C));
            A.set(C,temp);
            
             B++;
            C--;
        }   

        return A;
    }
    
}
