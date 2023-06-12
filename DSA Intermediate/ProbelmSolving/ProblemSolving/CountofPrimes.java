//Count of prime numbers.
//You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

public class Solution {
    public int solve(int A) {

   int i,count =0;
   for (i=1;i<=A;i++)
   {
       count= count + primeNumber(i);
   }
    return count;
 }

public int primeNumber(int n)
{
    int i,count=0;
 
    for(i=1;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
        if(i==n/i)
        count=count + 1;
        else
        count = count + 2;
        }
    }

    if(count==2)
    return 1;
    else
    return 0;
}

}
