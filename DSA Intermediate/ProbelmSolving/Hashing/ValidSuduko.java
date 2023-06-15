/*
Valid Sudoku

Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> A) {
        int col=0;
        int row=0;
        int k=0,l=0;
        char[][] box=new char[9][9];

        for(k=0;k<A.size();k++)
        {
            String s=A.get(k);  
            for(l=0;l<9;l++)
            {
                    box[k][l]=s.charAt(l);
            }
        }

        //columns check
        for(col=0;col<9;col++)
        {
            HashSet<Character> hset = new HashSet<Character>();
            for(row=0;row<9;row++)
            {
                if(box[row][col]=='.')
                continue;
                else
                {
                    if(hset.contains(box[row][col]))
                    return 0;
                    else
                    hset.add(box[row][col]);
                }
            }
        }

        //row check
        for(row=0;row<9;row++)
        {
            HashSet<Character> hset = new HashSet<Character>();
            for(col=0;col<9;col++)
            {
                if(box[row][col]=='.')
                continue;
                else
                {
                    if(hset.contains(box[row][col]))
                    return 0;
                    else
                    hset.add(box[row][col]);
                }
            }
        }

        //box check
        int rowstart=0,colstart=0;
        int i=0,j=0;
        for(rowstart=0;rowstart<9;rowstart+=3)
        {
            for(colstart=0;colstart<9;colstart+=3)
            {
                 HashSet<Character> hset = new HashSet<Character>();
                 for(i=rowstart;i<rowstart+3;i++)
                 {
                     for(j=colstart;j<colstart+3;j++)
                     {
                          if(box[i][j]=='.')
                             continue;
                          else
                            {
                                if(hset.contains(box[i][j]))
                                    return 0;
                                else
                                    hset.add(box[i][j]);
                            }
                     }
                 }
            }
        }
        return 1;
    }
}
