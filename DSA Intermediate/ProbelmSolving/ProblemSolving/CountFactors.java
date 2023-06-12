public class Solution {
    public int solve(int A) {

        int i,count=0;

        for(i=1;i<=Math.sqrt(A);i++)
        {
           if(A%i==0)
          {
              
              if(i==A/i)
              {
                count = count +1;
              }
              else
              {
                count =count +2;
              }
                                
          }
        }
        return count;
    }
}
