import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 2 * N; i++) {
            int stars = i <= N ? i : 2 * N - i;
            int spaces = (N - stars) * 2;
            sb.append("*".repeat(stars));
            sb.append(" ".repeat(spaces));
            sb.append("*".repeat(stars));
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}