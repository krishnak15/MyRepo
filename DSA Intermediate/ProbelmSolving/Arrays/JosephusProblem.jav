/*
Josephus Problem - 2

There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and pass the knife to the next person standing in circle. This process continues till there is only 1 person remaining. Find the last person standing in the circle.

*/


public class Solution {
    public int solve(int A) {

        int i,x=0,y=0;
        int ans=0;


        for(i=0;i<A;i++)
        {
            if((int)Math.pow(2,i)>A)
            {
                break;
            }
            else
            {
                y=(int)Math.pow(2,i);
            }

        }

        x=A-y;

        ans=2*x +1;

        return ans;


    }
}
