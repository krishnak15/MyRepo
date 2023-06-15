/*
String operations
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
*/
public class Solution {
    public String solve(String A) {
       
      int i=0;
        int n=A.length();
        StringBuilder build = new StringBuilder(A);
         StringBuilder build1 = new StringBuilder(A);
        int m=build.length();
        int k=i;
        for(i=0;i<m;i++)
        {
              
            if((build.charAt(i)>='A')&&(build.charAt(i)<='Z'))
            {
                build1.deleteCharAt(k);
                k--;
            }
            k++;
        }
         
        for(i=0;i<build1.length();i++)
        {
            if((build1.charAt(i)=='a')||(build1.charAt(i)=='e')||(build1.charAt(i)=='i')||(build1.charAt(i)=='o')||(build1.charAt(i)=='u'))
            {
                build1.setCharAt(i,'#');
            }
        }
       
         String B=build1.toString();
        return B.concat(B);
    }
}
