/*
Bulbs

A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.

*/

public class Solution {
    public int bulbs(ArrayList<Integer> A) {

        if(A.isEmpty())
        {
            return 0;
        }
        
        int i,j=0;
        int count=0;
         if(A.get(0)==0)
           {
               count++;
           }
        for(i=1;i<A.size();i++)
        {
                    
           if(A.get(i)==0 && A.get(i-1)==1)
           {
               count++;
               
            }

        }
        if(A.get(A.size()-1)==0)
        {
            count =count*2-1;
        }
        else
            count =count*2;
        return count;

    }
}
