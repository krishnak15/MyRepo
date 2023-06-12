/*
Tens Digit Sorting

Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.

If a number has no tens digit, we can assume value to be 0.
If 2 numbers have same tens digit, in that case number with max value will come first
Solution should be based on comparator.
*/

public class Solution {
    int indexi=0,quotienti=0,valuei=0;
    public Solution()
    {}
    public Solution(int index, int quotient, int value)
    {
        indexi=index;
        quotienti=quotient;
        valuei=value;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> B= new ArrayList<Integer>();
        B= printOnTensDigit(A, A.size());
        return B;
        
    }
    static ArrayList<Integer> printOnTensDigit(ArrayList<Integer> A, int n)
    {   
        Solution num[] = new Solution[n];

        for (int i=0; i<n; i++)
        {
            num[i] = new Solution(i,(A.get(i)%100)/10,A.get(i));
        }
 
        Arrays.sort(num,new Comparator<Solution>() {
 
            @Override
            // compare method for the elements
            // of the structure
            public int compare(Solution e1, Solution e2) {
            
            if(e1.quotienti<e2.quotienti)
            {
            return -1;
            }
            else if(e1.quotienti>e2.quotienti)
            {
            return 1;
            }
            else if(e1.valuei< e2.valuei)
                {
                return 1;
                }
                else if(e1.valuei> e2.valuei)
                {
                return -1;
                }
                else
                {
                    return 0;
                }       
                
               
            


            }
             
        });
      
       ArrayList<Integer> B= new ArrayList<Integer>();
        // access index from the structure element and corresponding
        // to that index access the element from arr
        for (int i=0; i<n; i++)
            B.add(A.get(num[i].indexi));
      //  A= new ArrayList<Integer>();
          //  A.addAll(B);
          return B;
    }

}
