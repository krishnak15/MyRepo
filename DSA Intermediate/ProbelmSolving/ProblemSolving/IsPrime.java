public class Solution {
    public int solve(Long A) {
        int i,count=0;
        for(i=1;i<=Math.sqrt(A);i++)
        {
            if(A%i==0)
            {
                if(A/i==i)
                count = count +1;
                else
                count =count +2;
            }
        }
        if(count==2)
        {
        return 1;
        }
        else
        {
        return 0;
        }
    }
}
