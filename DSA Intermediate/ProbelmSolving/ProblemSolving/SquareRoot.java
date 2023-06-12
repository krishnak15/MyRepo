
//Perfect square or not
//Return square root of the number if it is perfect square otherwise return -1
public class Solution {
    public int solve(int A) {
     
        int i,returnvar=-1;
          
       for (i=1;i*i<=A;i++)
       {
           if(i*i==A)
           {
           returnvar=i;
           }
           
       }

     return returnvar;

    }
}
