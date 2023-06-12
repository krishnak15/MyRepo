/*
Factors sort


You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.

Note: You cannot use any extra space


*/


public class Solution {

    int index, no_of_fact,value;

    public Solution()
    {
        index=0;
        no_of_fact=0;
        value=0;
    }
  
    public Solution(int i, int countFactors,int ivalue)
    {
        index = i;
        no_of_fact = countFactors;
        value=ivalue;
    }

     static int countFactors(int nNumber)
    {
       int i,count=0;

        for(i=1;i<=Math.sqrt(nNumber);i++)
        {
           if(nNumber%i==0)
          {
              
              if(i==nNumber/i)
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

    static ArrayList<Integer> printOnBasisOfFactors(ArrayList<Integer> A, int n)
    {   
        Solution num[] = new Solution[n];
      
        // for each element of input array create a
        // structure element to store its index and
        // factors count
        for (int i=0; i<n; i++)
        {
            num[i] = new Solution(i,countFactors(A.get(i)),A.get(i));
        }
      
        // sort the array of structures as defined
        Arrays.sort(num,new Comparator<Solution>() {
 
            @Override
            // compare method for the elements
            // of the structure
            public int compare(Solution e1, Solution e2) {
            
            if(e1.no_of_fact<e2.no_of_fact)
            {
            return -1;
            }
            else if(e1.no_of_fact>e2.no_of_fact)
            {
            return 1;
            }
            else if(e1.value< e2.value)
                {
                return -1;
                }
                else if(e1.value> e2.value)
                {
                return 1;
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
            B.add(A.get(num[i].index));
      //  A= new ArrayList<Integer>();
          //  A.addAll(B);
          return B;
    }

    public  ArrayList<Integer> solve(ArrayList<Integer> A) {
         ArrayList<Integer> B= new ArrayList<Integer>();
       B= printOnBasisOfFactors(A, A.size());
        return B;
    }

}
