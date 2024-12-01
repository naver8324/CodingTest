import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> ledger = new Stack<>();

        for (int i = 0; i < K; i++) {
            int money = Integer.parseInt(br.readLine());
            if (money == 0) {
                ledger.pop();
            } else {
                ledger.push(money);
            }
        }

        int sum = 0;
        for (int i : ledger) {
            sum += i;
        }

        System.out.println(sum);

        br.close();
    }
}
