/*
Common Elements

Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.

*/
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
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
          if(map2.containsKey(key))
           {
            if (map1.get(key)>=map2.get(key)) {
                count=map2.get(key);
                while(count!=0)
                {
                commonElements.add(key);
                count=count-1;
                }
            }
     
            else
               if (map1.get(key)<map2.get(key)) {
                count=map1.get(key);
                while(count!=0)
                {
                commonElements.add(key);
                count=count-1;
                }
            }

        }
        }
       return commonElements;
     }
}


      