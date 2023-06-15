/*
Add Binary Strings

Given two binary strings A and B. Return their sum (also a binary string).


*/
public class Solution {
    public String addBinary(String A, String B) {

        int i=A.length()-1;
        int j=B.length()-1;
        int carry=0;
        int sum=0;
        int bit=0;
        String ans="";
        
        while(i>=0 || j>=0 || carry>0)
        {

            sum=0;
            if(i>=0)
            {
                sum+=(A.charAt(i)-'0');
                i--;
            }
            if(j>=0)
            {
                sum+=(B.charAt(j)-'0');
                j--;
            }
            sum+=carry;
            bit=sum%2;
            carry=sum/2;
            ans+=(char)(bit+'0');

        }

        StringBuilder input1 = new StringBuilder();
  
        // append a string into StringBuilder input1
        input1.append(ans);
  
        // reverse StringBuilder input1
        input1.reverse();

        return input1.toString();

    }
}
