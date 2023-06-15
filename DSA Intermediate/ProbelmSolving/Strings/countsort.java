/*
Count Sort

Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.

*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

            int i,n=A.size();
        int max=0;
        //Find maximum number
        for(i=0;i<n;i++)
        {
            max=Math.max(max,A.get(i));
        }
     
        //initialise with 0
        ArrayList<Integer> Count=new ArrayList<Integer>(max+1);
        for (i=0;i< max+1; i++)   
        {  
             Count.add(0); 
          }  
         
          //create count array
        for(i=0;i<n;i++)
        {
           int index=A.get(i);
           int value=Count.get(index);
           Count.set(index,value+1);
            
        }
       
        //post array
         for (i=1;i< max+1; i++)   
        {  
             Count.set(i,(Count.get(i-1)+Count.get(i)));
          }  
       
        //Create Output array
        ArrayList<Integer> Output=new ArrayList<Integer>(n);
        for (i=0;i< n; i++)   
        {  
             Output.add(0); 
          }  
         
        for (i=0;i< n; i++)   
        {  
            int index=A.get(i);
            int Sumindex=Count.get(index);
            Count.set(index,Sumindex-1);
             Output.set(Sumindex-1,A.get(i));
          }  
         
        
        return Output;
    

    }
}
