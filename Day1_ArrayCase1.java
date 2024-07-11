import java.util.*;
public class Day1_ArrayCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Days Temperature to be recorded : ");
        int numberOfDays = sc.nextInt();
        
        int[] temp= new int[numberOfDays];
        int sum=0;
        for(int i = 0 ; i <numberOfDays;i++){
            System.out.println("Day" +(i+1)+"s temperature : ");
            temp[i]=sc.nextInt();
            sum+=temp[i];
        }

        double average = (double)sum/numberOfDays;
        System.out.println("Average is : " + average);
        int countAbove=0;
        for(int j=0;j<numberOfDays;j++){
            if(temp[j]>average){
                countAbove++;
            }
        }
        System.out.println("No of Days above Average is : "+countAbove);
    }
}
