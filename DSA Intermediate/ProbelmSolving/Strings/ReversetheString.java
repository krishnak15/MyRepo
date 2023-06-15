/*
Reverse the String

You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
*/
public class Solution {
    public String solve(String A) {

        //string to string arry 

        String strArray[]=A.split(" ");
        int n=strArray.length;
        int i=0;
        int j=n-1;
        String Barray[]=new String[n];
        for(i=0;i<n;i++,j--)
        {
            Barray[i]=strArray[j];
        }
        String output=Barray[0];
         for ( i = 1; i < Barray.length; i++) {
            // Printing the elements of String array
           output=output + " " +  Barray[i] ;
        }
        return output;
    }
}
