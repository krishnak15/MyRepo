/*

 Length of longest consecutive ones

Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
*/

public class Solution {
    public int solve(String A) {
    
    char[] ch = A.toCharArray();
    int n=ch.length;
    int i,k,l,r,ans=0,count1s=0;

    for(i=0;i<n;i++)
    {
        if(ch[i]=='1')
        {
            count1s++;
        }
    }
    l=0;
    r=0;
    for(i=0;i<n;i++)
    {
        if(ch[i]=='0')
        {
        
        if(i==0)
        {
            for(k=i+1;k<n;k++)
            {
                if(ch[k]=='1')
                {
                    r++;
                }
                else
                break;
            }
        }
        else
        {      
       
            l=0;
            for(k=i-1;k>=0;k--)
            {
                if(ch[k]=='1')
                {
                    l++;
                }
                else
                break;

            }
            r=0;
            for(k=i+1;k<n;k++)
            {
                if(ch[k]=='1')
                {
                    r++;
                }
                else
                break;
            }
        }
            if(count1s>l+r)
            ans=Math.max(ans,l+r+1);
            else
            ans=Math.max(ans,l+r);
        }

    }

    return ans;
    
    }
    
}
