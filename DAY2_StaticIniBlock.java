// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true


import java.util.*;


public class DAY2_StaticIniBlock {

static Scanner scan = new Scanner(System.in);
static int B = scan.nextInt();
static int H = scan.nextInt();
static boolean flag = true;
static{
    try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){
        System.out.println(e);
    }

}
public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        
    }

}