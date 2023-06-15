/*
Subset

Given a set of distinct integers A, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The list is not necessarily sorted.

*/
public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
        int i=0;
        int j=0;         
        Collections.sort(A);
        int n=A.size();
        for(i=0;i<Math.pow(2,n);i++)
        {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for( j=0;j<n;j++)
            {
                    if(checkBit(i,j,n))
                    temp.add(A.get(j));
            }
            output.add(temp);
        }

       sortbyArray(output);
        return output;
    }

    public void sortbyArray(ArrayList<ArrayList<Integer>> B)
    {
        Collections.sort(B,new Comparator<ArrayList<Integer>>(){
            @Override
            public int compare(ArrayList<Integer> A1,ArrayList<Integer> A2)
            {
                if(A1.size()==0)
                return -1;
                if(A2.size()==0)
                return 1;
                
                int a1size=A1.size();
                int a2size=A2.size();
                int loop=a1size>=a2size?a2size:a1size;
                int i=0;
                for(i=0;i<loop;i++)
                {
                    if(A1.get(i)==A2.get(i))
                    continue;
                    return A1.get(i).compareTo(A2.get(i));
                }
                return A1.get(0).compareTo(A2.get(0));
            }
        });
    }

    public boolean checkBit(int num,int bitn,int n)
    {
        String bin=Integer.toBinaryString(num);
        while(bin.length()<n)
        {
            bin='0'+bin;
        }
        if(bin.charAt(bitn)=='0')
            return false;
        else
            return true;
    }
}
