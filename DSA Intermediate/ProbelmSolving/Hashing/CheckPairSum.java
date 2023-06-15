/*
Check Pair Sum

Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
*/
public class Solution {
    public int solve(int A, ArrayList<Integer> B) {

        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        int n=B.size();
        int i=0,count=0;
        int a=0,b=0;

            for(i=0;i<n;i++)
            {
                if(hmap.containsKey(B.get(i)))
                {
                    count=hmap.get(B.get(i))+1;
                    hmap.put(B.get(i),count);
                }
                else
                {
                    hmap.put(B.get(i),1);
                }

            }

        for(i=0;i<n;i++)
        {
            a=B.get(i);
            b=A-a;

            if(a!=b && hmap.containsKey(b)==true)
            {
                return 1;
            }
            else if(a==b && hmap.get(a)>1)
            {
                return 1;
            }


        }
        return 0;

    }
}
