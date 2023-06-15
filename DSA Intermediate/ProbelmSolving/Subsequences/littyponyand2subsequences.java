/*
 Little Ponny and 2-Subsequence

Little Ponny has been given a string A, and he wants to find out the lexicographically minimum subsequence from it of size >= 2. Can you help him?

A string a is lexicographically smaller than string b, if the first different letter in a and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".
*/
public class Solution {
    public String solve(String A) {
    String ss=sortString(A);
   
    if((ss.charAt(0))==(ss.charAt(1)))
    return ss.substring(0,2);
    else
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length();i++)
        {
            hm.put(A.charAt(i),i);
        }


        if(hm.get(ss.charAt(0))==A.length()-1)
        {
            return (String.valueOf(ss.charAt(1)) + ss.charAt(0));
        }
        else
        {
            //check if second elements index is greater than first else loop.

           int k=hm.get(ss.charAt(0));
           String snew=A.substring(k);
           String newsort=sortString(snew);
            return  (String.valueOf(ss.charAt(0)) + newsort.charAt(1));

        }

     
    }
    }
    public String sortString(String s)
    {
        char tempArr[]=s.toCharArray();
        Arrays.sort(tempArr);
        return new String(tempArr);
    }
}
