/*
 Change character

You are given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.

*/

public class Solution {
    public int solve(String A, int B) {

       if(A.length()==B)
       {
           return 1;
       }
       int count;
       HashMap<Character,Integer> map= new HashMap<>();
         for(char c:A.toCharArray()){
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }else{
               
                count = map.get(c) + 1;
                map.put(c,count);
            }
        }

        List<Map.Entry<Character,Integer>> list=new LinkedList<Map.Entry<Character,Integer>>(map.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
                return (o1.getValue()).compareTo(o2.getValue());
            }

        });

        HashMap<Character,Integer> temp=new LinkedHashMap<Character,Integer>();
        for(Map.Entry<Character,Integer> aa: list){
            temp.put(aa.getKey(),aa.getValue());
        }

        //removing B elements
        int tempValue=B;

         Iterator hmIterator = temp.entrySet().iterator();
          while (tempValue>0 && hmIterator.hasNext()) {
 
            Map.Entry mapElement
                = (Map.Entry)hmIterator.next();
            
            if((int)(mapElement.getValue()) <= tempValue)
            {
                tempValue=tempValue-(int)mapElement.getValue();
                map.remove(mapElement.getKey(),mapElement.getValue());

            }
            else
            break;
             
        }

      return map.size();
}
}



