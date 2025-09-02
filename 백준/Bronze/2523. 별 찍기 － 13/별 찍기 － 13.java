import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n * 2 - 1; i++) {
            int stars = i < n ? i : n * 2 - i;

            sb.append("*".repeat(stars));
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
