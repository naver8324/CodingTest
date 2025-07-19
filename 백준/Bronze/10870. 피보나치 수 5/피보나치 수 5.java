import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] fibonacci = new int[21];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= 20; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }

        System.out.println(fibonacci[N]);
    }
}