/*
Implement Power Function

Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).

Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
*/
public class Solution {
    public int pow(int A, int B, int C) {

     long output= power(A,B,C);
     if(A<0 && B%2!=0)
     {
         return (int)(output+C);
     }
     else
     {
         return (int)output;
     }

    }

public long power(int A,int B,int C)
{
    
        long p=0;

        if(A==0){
            return 0;
        }
       //int Avalue=Math.abs(A);
        if(B==0){return 1;}
        
        p=(long)power(A,B/2,C);
        

        if(B%2==0)
        {
            return ((p*p)%C);
        }
        else
        {
            return (((p*p)%C) * A)%C;

        }
}

}
