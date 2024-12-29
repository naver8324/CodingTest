import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int sum =  A * B * C;
        int[] numberCount = new int[10];
        while (sum > 0) {
            int n = sum % 10;
            numberCount[n]++;
            sum /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : numberCount) {
            sb.append(i).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}