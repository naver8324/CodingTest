import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < N; i++) {
            int temp = i;
            int construtor = temp;

            while (temp > 0) {
                construtor += temp%10;
                temp /= 10;
            }

            if (construtor == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

        sc.close();
    }
}