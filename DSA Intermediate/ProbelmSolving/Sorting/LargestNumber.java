/*
Largest Number

Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.

*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        
        int count=0;
        for (int element : A) 
        {
            if (element != 0)
            {
                    count++;
                    break;
            }  
        }
        if(count==0)
            return "0";

        ArrayList<String> sNumbers = new ArrayList<String>();
        for (Integer i: A) {
            sNumbers.add(String.valueOf(i));
        }
        return  printLargest(sNumbers);
    }
   
    static String printLargest(ArrayList<String> arr)
    {
         Collections.sort(arr, new Comparator<String>()
        {           
            @Override public int compare(String X, String Y)
            {               
                return (Y.concat(X)).compareTo(X.concat(Y));
            }
        }); 

        StringBuilder sb=new StringBuilder();
        
            for(int i=0;i<arr.size();i++)
            {
                sb=sb.append(arr.get(i));
            }
      
        
        return sb.toString();            
    }
}
 

