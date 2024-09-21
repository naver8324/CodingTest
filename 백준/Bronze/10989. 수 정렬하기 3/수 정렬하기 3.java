import java.io.*;

public class Main {
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        radixSort(arr);

        for(int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void radixSort(int[] arr){
        int[] sortedArr = new int[arr.length];
        int placeValue = 1;
        int max = getMax(arr);

        while (max / placeValue > 0) {
            int[] digitCount = new int[10];

            for (int n : arr) {
                digitCount[n / placeValue % 10]++;
            }

            for(int i = 1; i < digitCount.length; i++) {
                digitCount[i] += digitCount[i - 1];
            }

            for(int i = arr.length - 1; i >= 0; i--) {
                digitCount[arr[i] / placeValue % 10]--;
                sortedArr[digitCount[arr[i] / placeValue % 10]] = arr[i];
            }

            System.arraycopy(sortedArr, 0, arr, 0, arr.length);

            placeValue *= 10;
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
