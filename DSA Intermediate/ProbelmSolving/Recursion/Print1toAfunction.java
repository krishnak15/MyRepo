/*
 Print 1 to A function

You are given an integer A, print 1 to A using using recursion.
*/

public class Solution {
    public void solve(int A) {
       printA(A);
        System.out.println();
      
    }
    public void printA(int n){

        if(n==1)
        {
            System.out.print("1 ");
            return;
        }
       
        printA(n-1);
        System.out.print(n + " ");
   
    }
   
}
