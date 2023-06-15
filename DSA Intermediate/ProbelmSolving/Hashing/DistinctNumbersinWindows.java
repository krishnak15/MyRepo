/*
Distinct Numbers in Window

You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.
*/
public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

            HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        int n=A.size();
        int i=0,count=0;
        int a=0,b=0;
            ArrayList<Integer> outArray=new ArrayList<Integer>();
            if(B>n)
            {
                return outArray;
            }

            //insert first B elements
            for(i=0;i<B;i++)
            {
                if(hmap.containsKey(A.get(i)))
                {
                    count=hmap.get(A.get(i))+1;
                    hmap.put(A.get(i),count);
                }
                else
                {
                    hmap.put(A.get(i),1);
                }

            }

        outArray.add(hmap.size());

        int s=1,e=B;

        while(e<n)
        {

                hmap.put(A.get(s-1),hmap.get(A.get(s-1)) -1);

                if(hmap.get(A.get(s-1))==0)
                {
                    hmap.remove(A.get(s-1));
                }

                if(hmap.containsKey(A.get(e))==true)
                {
                    hmap.put(A.get(e),hmap.get(A.get(e))+1);
                }
                else
                {
                    hmap.put(A.get(e),1);
                }


            outArray.add(hmap.size());
            s++;
            e++;
        }

        return outArray;

    }
}
