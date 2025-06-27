import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;
        int count = 0;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum < x) {
                start++;
            } else if (sum > x) {
                end--;
            } else {
                start++;
                end--;
                count++;
            }
        }

        System.out.println(count);
    }
}