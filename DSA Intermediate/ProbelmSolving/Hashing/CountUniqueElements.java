/*
Count unique elements

You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        int i, count=0;
        for(i=0;i<A.size();i++)
        {
            if (map1.containsKey(A.get(i))) {
                count=map1.get(A.get(i))+1;
                map1.put(A.get(i),count);
            }
            else
            map1.put(A.get(i),1);
        }
        //System.out.println(map1);
        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
               for(i=0;i<B.size();i++)
        {
            if (map2.containsKey(B.get(i))) {
                count=map2.get(B.get(i))+1;
                map2.put(B.get(i),count);
            }
            else
            map2.put(B.get(i),1);
        }
        //System.out.println(map2);
 
         ArrayList<Integer> commonElements
            = new ArrayList<Integer>();
        for (Map.Entry<Integer,Integer> mapElement : map1.entrySet()) {
            int key = mapElement.getKey();
            //System.out.println(map2);
           // System.out.println(map2);
            if (map1.get(key)>=map2.get(key)) {
                count=map2.get(key);
                while(count!=0)
                {
                commonElements.add(key);
                count=count-1;
                }
            }
            /*
            else
               if (map1.get(A.get(i))<map2.get(A.get(i))) {
                count=map1.get(A.get(i));
                while(count!=0)
                {
                commonElements.add(A.get(i));
                count=count-1;
                }
            }
            */
        }
        
       return commonElements;

}
}