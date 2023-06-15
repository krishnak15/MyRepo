/*
Print reverse string

Write a recursive function that, given a string S, prints the characters of S in reverse order.

*/
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner myInput=new Scanner(System.in);
        String A=myInput.nextLine();
        stringReverse(A);

    }

    public static void stringReverse(String A)
    {

        printReverse(A,A.length()-1);

    }

    public static void printReverse(String A,int n)
    {

        if(n==0)
        {
            System.out.print(A.charAt(0));
            return;
        }
        else
        {
             System.out.print(A.charAt(n));
        }

        printReverse(A,n-1);
        

    }


}