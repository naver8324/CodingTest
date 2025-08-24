import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            String[] ab = br.readLine().split(",");

            sb.append(Integer.parseInt(ab[0]) + Integer.parseInt(ab[1])).append("\n");
        }

        System.out.print(sb.toString());
    }
}