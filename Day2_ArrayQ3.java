
/*Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87} */
public class Day2_ArrayQ3 {
    public static int[] findTopTwoScores(int[] array){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        
        for(int i=0; i<array.length;i++){
            if(array[i]>first)
            {
                second=first;
                first=array[i];
            }
            else if(array[i]>second && array[i]<first){
                second=array[i];
            }
        }
        return new int[]{first,second};
      }
}
