/*
Count Subarray Zero Sum

Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
       int count  = 0;
    HashMap< Integer, Integer> hmap = new HashMap< >();
    int i = 0;
    int sum = 0;
    
    if(A.size()==1 && A.get(0)==0)
    return 1;

    while (i < A.size()) {

      
      sum =sum+ A.get(i);
   
      if (hmap.containsKey(sum)) {


        hmap.put(sum, hmap.get(sum) + 1);
      } else {
        hmap.put(sum, 1);
      }
      i++;
    }
    // System.out.println(hmap);
     for (Map.Entry<Integer,Integer> mapElement : hmap.entrySet()) {
             if(mapElement.getKey()==0 && mapElement.getValue()==1)
             {
             count=count+1;
             //System.out.println("sum0 0 times"+count);
     }
          if(mapElement.getKey()==0 && mapElement.getValue()>1)
             {
                 int n=mapElement.getValue();
            count=count+n;
            //System.out.println("sum0 more times"+count);
  
     }
     
 
          
            if(mapElement.getValue()>1)
            {
              int n=mapElement.getValue();
            count=count+(n*(n-1))/2;
            //System.out.println("same sum times"+count);
            }
 


        }
      

    return count%1000000007;
}
}

  

