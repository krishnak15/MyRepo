/* 
Help From Sam

Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target score of A for himself.
Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's score. Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.

Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.

*/
public class Solution {
    public int solve(int A) {
        int num=A;
        int count=0;

        if(A==0)
        {
            return 0;
        }
        else if(A==1)
        {
            return 1;
        }
        
        if((num&1)==1)
        count++;
        while(num!=0)
        {
            if(((num>>1)&1) ==1)
            count++;

            num =num>>1;
        }

       return count;


    }
}
