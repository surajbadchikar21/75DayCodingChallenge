// Question - https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
import java.io.*;




public class Day1_IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
    if(N%2!=0){
        System.out.println("Weird");
    }
    else if(N%2==0){
        if(N>=2 &&N<=5){
             System.out.println("Not Weird");
        }
        else if(N>=6 &&N<=20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
       
    }
        bufferedReader.close();
    }
}
