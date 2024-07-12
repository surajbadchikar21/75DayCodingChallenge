/*Missing Number
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5 */

public class Day2_ArrayQ4 {
    static int findMissingNumberInArray(int[] arr) {
        int sum=0;
        int n=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int totalSum=n*(n+1)/2;
        return totalSum-sum;
      }
}

