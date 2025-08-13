import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < N; j++) {
            sb.append(" ".repeat(Math.max(0, N - (N - j))));
            sb.append("*".repeat(Math.max(0, (N - j) * 2 - 1)));
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}