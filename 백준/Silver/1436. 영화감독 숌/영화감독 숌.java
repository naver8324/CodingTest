import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int startNum = 665;

        while (N != 0) {
            startNum++;
            if (String.valueOf(startNum).contains("666")) {
                N--;
            }
        }

        System.out.println(startNum);
        sc.close();
    }
}
