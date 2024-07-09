// Question - https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

import java.util.*;

import java.lang.Math;

class Day1_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n]; 
            for(int j =0;j<n;j++)
            {    
               
                int series=a;
                for(int k=0;k<=j;k++)
                {
                    series += Math.pow(2, k) * b;
                }
                System.out.print(series + " ");
                // arr[j]=series;
                
           
            }
            //      for(int l=0;l<arr.length;l++)
            // {
            //     System.out.print(arr[l] + " ");
                
            // }
            System.out.println();
        }
        in.close();
    }
}
