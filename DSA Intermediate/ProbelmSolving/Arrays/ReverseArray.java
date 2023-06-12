/* 
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.

*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A) {

        ArrayList<Integer> B=new ArrayList<Integer>(A.size());
        B.addAll(A);
        int pointer1=0,temp=0;
        int pointer2=B.size()-1;

        while(pointer1<pointer2)
        {

            temp=B.get(pointer1);
            B.set(pointer1,B.get(pointer2));
            B.set(pointer2,temp);

            pointer1++;
            pointer2--;
        }

        return (B);
    }
}
