import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        int move = 1;
        int range = 1;

        while (N > range) {
            range += move * 6;
            move++;
        }

        System.out.println(move);

        sc.close();
    }
}