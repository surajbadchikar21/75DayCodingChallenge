// https://www.geeksforgeeks.org/chocolate-distribution-problem/

import java.util.Arrays;
public class DAY5_ChocolateDistribution {
    int diff=Integer.MAX_VALUE;
    public int minimum_diff(int[] arr,int m){

        if(arr.length==0){
            return 0 ;
        }



        Arrays.sort(arr);
        for(int i = 0;i<arr.length-m;i++){
            
            int temp=arr[i+m-1]-arr[i];
            if(temp<diff) {
                diff=temp;
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        int [] arr ={3, 4, 1, 9, 56, 7, 9, 12};
        DAY5_ChocolateDistribution a= new DAY5_ChocolateDistribution();
        int val=a.minimum_diff(arr, 5);
        System.out.println("Minimum Diff : "+ val);
    }
}
