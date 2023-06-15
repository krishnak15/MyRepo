/*
 Kth Symbol - Easy

On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
*/
public class Solution {
    public int solve(int A, int B) {

         ArrayList<Character> inputArray=new ArrayList<Character>();
        ArrayList<Character> outputArray=new ArrayList<Character>();
        inputArray.add('0');
        outputArray=Arow(A,inputArray);
        return outputArray.get(B)-'0';
    }


    public ArrayList<Character> Arow(int A,ArrayList<Character> Achar)
    {
        int i=0;
        if(A==0)
        return Achar;
        A--;
        ArrayList<Character> temp=new ArrayList<Character>();
        for(i=0;i<Achar.size();i++)
        {
            if(Achar.get(i)=='0')
            {
                    temp.add('0');
                    temp.add('1');
            }
            else
            {
                temp.add('1');
                temp.add('0');
            }
        }
        return Arow(A,temp);
    }
}
