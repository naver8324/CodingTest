import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        if (N >= 125) {
            result += N / 125;
        }
        if (N >= 25) {
            result += N / 25;
        }
        if (N >= 5) {
            result += N / 5;
        }

        System.out.println(result);

        sc.close();
    }
}
