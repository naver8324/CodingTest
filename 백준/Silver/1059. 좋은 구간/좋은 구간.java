import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int[] S = new int[L];
        for (int i = 0; i < L; i++) {
            S[i] = sc.nextInt();
        }
        int n = sc.nextInt();

        Arrays.sort(S);

        for (int num : S) {
            if (num == n) {
                System.out.println(0);
                return;
            }
        }

        int lower = 0;
        int upper = 1001;

        for (int num : S) {
            if (num < n) {
                lower = Math.max(lower, num);
            } else if (num > n && num < upper) {
                upper = num;
            }
        }

        int count = 0;
        for (int a = lower + 1; a <= n; a++) {
            for (int b = n; b < upper; b++) {
                if (a < b) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
