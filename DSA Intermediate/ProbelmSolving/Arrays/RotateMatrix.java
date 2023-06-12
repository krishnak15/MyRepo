/*
Rotate Matrix

You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.

*/


public class Solution {
    public void solve(ArrayList<ArrayList<Integer>> A) {

        int i,j,n=A.size(),temp;
        //transpose
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<i;j++)
                {
                    //swap a[i][j] with a[j][i]
                    temp=A.get(i).get(j);
                    A.get(i).set(j,A.get(j).get(i));
                    A.get(j).set(i,temp);

                }
            }

        //reverse
           
            for(i=0;i<n;i++)
            {
                for(j=0;j<n/2;j++)
                {
                    //swap a[i][j] with a[i][n-1-j]
                     temp=A.get(i).get(j);
                    A.get(i).set(j,A.get(i).get(n-1-j));
                    A.get(i).set(n-1-j,temp);
                    
                }
            }          
    }
}
