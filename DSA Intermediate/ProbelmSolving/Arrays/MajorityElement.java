/*
Majority Element

Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.

*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {

            int majele=A.get(0);
            int freq=1,i;

            for(i=1;i<A.size();i++)
            {
                if(majele!=A.get(i)&&freq==0)
                {
                        majele=A.get(i);
                        freq=1;
                }
                else if(majele!=A.get(i))
                {
                    freq--;
                }
                else{
                freq++;
                }
            }

            return majele;

    }
}
