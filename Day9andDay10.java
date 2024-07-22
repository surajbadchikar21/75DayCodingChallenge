import java.io.*;
import java.util.*;

public class Day9andDay10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of lines
        List<List<Integer>> lines = new ArrayList<>();

        // Reading the lines
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); 
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }

        int q = sc.nextInt(); 
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); 
            int y = sc.nextInt(); 

    
            if (x <= lines.size() && x > 0 && y > 0 && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}

