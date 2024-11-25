import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a > c) {
                int temp = c;
                c = a;
                a = temp;
            }

            if (b > c) {
                int temp = c;
                c = b;
                b = temp;
            }

            if (c == 0) {
                break;
            }

            System.out.println(a * a + b * b == c * c ? "right" : "wrong");
        }


        sc.close();
    }
}