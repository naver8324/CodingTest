import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        Integer[] arr = new Integer[N.length()];

        int sum = 0;
        boolean hasZero = false;

        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';
            arr[i] = digit;
            sum += digit;
            if (digit == 0) {
                hasZero = true;
            }
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (int n : arr) {
            sb.append(n);
        }

        System.out.println(sb.toString());
    }
}