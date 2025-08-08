import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();
        int one = 0;
        int zero = 0;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n > 1) {
                plus.add(n);
            } else if (n == 1) {
                one++;
            } else if (n == 0) {
                zero++;
            } else {
                minus.add(n);
            }
        }

        int sum = one;

        plus.sort(Collections.reverseOrder());
        Collections.sort(minus);

        for (int i = 0; i + 1 < plus.size(); i += 2) {
            sum += plus.get(i) * plus.get(i + 1);
        }

        if (plus.size() % 2 == 1) {
            sum += plus.get(plus.size() - 1);
        }

        for (int i = 0; i + 1 < minus.size(); i += 2) {
            sum += minus.get(i) * minus.get(i + 1);
        }

        if (minus.size() % 2 == 1 && zero == 0) {
            sum += minus.get(minus.size() - 1);
        }

        System.out.println(sum);
    }
}