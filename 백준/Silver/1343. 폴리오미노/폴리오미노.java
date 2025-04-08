import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] board = input.split("(?<=\\.)|(?=\\.)");

        StringBuilder sb = new StringBuilder();

        for (String b : board) {
            if (b.equals(".")) {
                sb.append(".");
                continue;
            }

            int n = b.length();
            if (n % 2 != 0) {
                System.out.println(-1);
                return;
            }

            while (n >= 4) {
                sb.append("AAAA");
                n -= 4;
            }
            if (n == 2) {
                sb.append("BB");
            }
        }

        System.out.println(sb.toString());
    }
}
