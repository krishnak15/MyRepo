/*
 toupper()
You are given a function to_upper() consisting of a character array A.

Convert each charater of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.
*/
public class Solution {
    public ArrayList<Character> to_upper(ArrayList<Character> A) {
        int n=A.size();
        for(int i=0;i<n;i++)
        {
            if(A.get(i)>='a'&& A.get(i)<='z')
            {
                A.set(i,(char)(A.get(i)-32));
            }
        }
        return A;
    }
        
}
