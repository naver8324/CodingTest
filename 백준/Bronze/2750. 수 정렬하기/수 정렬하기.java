import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] bubble = new int[N];

        for (int i = 0; i < N; i++) {
            bubble[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < N - i - 1; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        for (int i : bubble) {
            System.out.println(i);
        }

        sc.close();
    }
}