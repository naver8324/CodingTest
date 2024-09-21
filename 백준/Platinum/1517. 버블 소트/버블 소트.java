import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr, temp;
    public static long result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N+1];
        temp = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(1, N);

        System.out.println(result);

        br.close();
    }

    private static void mergeSort(int start, int end) {
        if (end - start < 1) {
            return;
        }

        int middle = start + (end - start) / 2;

        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        if (end + 1 - start >= 0) {
            System.arraycopy(arr, start, temp, start, end + 1 - start);
        }

        int currentIndex = start;
        int leftIndex = start;
        int rightIndex = middle + 1;

        while (leftIndex <= middle && rightIndex <= end) {
            if (temp[leftIndex] <= temp[rightIndex]) {
                arr[currentIndex++] = temp[leftIndex++];
            } else {
                arr[currentIndex++] = temp[rightIndex++];
                result += middle - leftIndex + 1;
            }
        }

        while (leftIndex <= middle) {
            arr[currentIndex++] = temp[leftIndex++];
        }

        while (rightIndex <= end) {
            arr[currentIndex++] = temp[rightIndex++];
        }
    }
}
