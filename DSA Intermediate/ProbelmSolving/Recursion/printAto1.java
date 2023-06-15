/*
 Print A to 1 function

You are given an integer A, print A to 1 using using recursion.
*/

public class Solution {
    public void solve(int A) {
        printA(A);
    }
    public static void printA(int n)
    {
        if(n==1)
        {
            System.out.println("1 ");
            return;
        }
        else
        {
            System.out.print(n + " ");
        }
        printA(n-1);
    }
}
