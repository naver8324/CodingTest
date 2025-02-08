import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long sum = 0;
        long n = 1;
        while (sum + n <= S) {
            sum += n;
            n++;
        }

        System.out.println(--n);
        sc.close();
    }
}
