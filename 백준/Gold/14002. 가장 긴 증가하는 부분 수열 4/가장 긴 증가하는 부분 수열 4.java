import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] dp = new int[N];     
        int[] prev = new int[N];  

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            dp[i] = 1;   
            prev[i] = -1;
        }

        int maxLength = 1;
        int lastIndex = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                lastIndex = i;
            }
        }

        System.out.println(maxLength);

        Stack<Integer> stack = new Stack<>();
        int idx = lastIndex;
        while (idx != -1) {
            stack.push(A[idx]);
            idx = prev[idx];
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
