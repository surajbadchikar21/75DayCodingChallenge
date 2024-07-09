// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
/*String formatting resource - 
https://www.geeksforgeeks.org/formatted-output-in-java/
 */
import java.util.Scanner;

public class Day1_OutputFormating {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

}
}