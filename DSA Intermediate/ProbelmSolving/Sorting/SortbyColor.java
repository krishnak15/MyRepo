/*
Sort by Color

Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.

Note: Using the library sort function is not allowed.
*/
public class Solution {
    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {

        int count0=0,count1=0,count2=0;
        int i=0;
        for(i=0;i<A.size();i++)
        {
            if(A.get(i)==0)
            {
                count0++;
            }
             if(A.get(i)==1)
            {
                count1++;
            }
             if(A.get(i)==2)
            {
                count2++;
            }
        }
       
        ArrayList<Integer> resultArray=new ArrayList<Integer>();

        for(i=0;i<count0;i++)
        {
            resultArray.add(0);
        }
        for(i=0;i<count1;i++)
        {
            resultArray.add(1);
        }
        for(i=0;i<count2;i++)
        {
            resultArray.add(2);
        }

        return resultArray;
       
    }
}
