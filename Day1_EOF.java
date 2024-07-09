// Question https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// EOF stands for End of file 
/*In computing, End Of File 
(commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." */
import java.io.*;
import java.util.*;

public class Day1_EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    
        int i=1;
        while(sc.hasNext()){
            System.out.println(i+" "+sc.nextLine());
            i++;
        }
    }
    
    
}
