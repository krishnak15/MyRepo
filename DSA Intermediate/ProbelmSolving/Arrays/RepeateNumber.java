/*
 N/3 Repeat Number

 You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

*/


public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
        
                int count1 = 0, count2 = 0;
         
        // take the integers as the maximum
        // value of integer hoping the integer
        // would not be present in the array
        int first =  Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        int n=a.size();
     
        for (int i = 0; i < n; i++) {
     
            // if this element is previously
            // seen, increment count1.
            if (first == a.get(i))
                count1++;
     
            // if this element is previously
            // seen, increment count2.
            else if (second == a.get(i))
                count2++;
         
            else if (count1 == 0) {
                count1++;
                first = a.get(i);
            }
     
            else if (count2 == 0) {
                count2++;
                second = a.get(i);
            }
     
            // if current element is different
            // from both the previously seen
            // variables, decrement both the
            // counts.
            else {
                count1--;
                count2--;
            }
        }
     
        count1 = 0;
        count2 = 0;
     
        // Again traverse the array and
        // find the actual counts.
        for (int i = 0; i < n; i++) {
            if (a.get(i) == first)
                count1++;
     
            else if (a.get(i) == second)
                count2++;
        }
     
        if (count1 > n / 3)
            return first;
     
        if (count2 > n / 3)
            return second;
     
        return -1;
    }    

}
