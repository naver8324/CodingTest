import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        StringBuilder sb = new StringBuilder();

        while ((n = Integer.parseInt(br.readLine())) != -1) {
            int perfectN = 0;
            List<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    perfectN += i;
                    divisors.add(i);
                }
            }

            if (perfectN == n) {
                sb.append(n).append(" = ");

                for (int i = 0; i < divisors.size(); i++) {
                    if (i == divisors.size() - 1) {
                        sb.append(divisors.get(i));
                    } else {
                        sb.append(divisors.get(i)).append(" + ");
                    }
                }
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}