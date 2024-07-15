/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place. 

https://leetcode.com/problems/set-matrix-zeroes/description/
*/

class DAY4_setZero{
    public void setZeroes(int[][] matrix) {
        int[] row=new int[matrix.length];
        int[] col=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        { 
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
      
        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<col.length;j++)
            {
                if(row[i] ==1 || col[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }

    }
}