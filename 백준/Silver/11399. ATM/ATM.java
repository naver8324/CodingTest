import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            int insert_point = i;
            int insert_value = arr[i];

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    insert_point = j + 1;
                    break;
                }
                if (j == 0) {
                    insert_point = 0;
                }
            }

            for (int j = i; j > insert_point; j--) {
                arr[j] = arr[j - 1];
            }

            arr[insert_point] = insert_value;
        }

        int[] prefixSum = new int[N];
        prefixSum[0] = arr[0];

        for(int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int sum = 0;
        for(int num : prefixSum) {
            sum += num;
        }

        System.out.println(sum);
        sc.close();
    }
}
