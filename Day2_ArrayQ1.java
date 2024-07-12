/* Middle Function
Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]. */ 

public class Day2_ArrayQ1 {
    public static int[] middle(int[] array) {
        //for array sizes less than or equal to 2;
        if (array.length <= 2) {
            return new int[0]; 
        }
        //create an array with length 2 less than the original array         
        int[] arr = new int[array.length - 2];
        //copy all ele except 1st and last ele 
        for (int i = 1; i < array.length - 1; i++) {
            arr[i - 1] = array[i];
        }

        return arr;
}
}

