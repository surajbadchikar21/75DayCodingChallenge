/*2D Arrays
Given 2D array calculate the sum of diagonal elements.

Example

myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 
sumDiagonalElements(myArray2D) # 15 */

public class Day2_ArrayQ2 {
    // public static int sumDiagonalElements(int[][] array) {
    //     int sum=0;
    //     for(int row=0;row<array.length;row++){
    //         for(int col=0;col<array[0].length;col++){
    //             if(row==col){
    //                 sum+=array[row][col];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    //More optimised 
    public static int sumDiagonalElements(int[][] array) {
        int sum=0;
        for(int row=0;row<array.length;row++){
           sum+=array[row][row];
            
        }
        return sum;
    }
}
