import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int GCD = euclidean(n1, n2);

        System.out.println(GCD);
        System.out.println(n1 * n2 / GCD);
        sc.close();
    }

    private static int euclidean(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
