import java.io.*;
import java.util.*;

class Main {
    static int M;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        int sum = 0;
        int lastValue = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            sum += A[i];
            if (lastValue < A[i]) {
                lastValue = A[i];
            }
        }

        System.out.println(binarySearch(lastValue, sum));
    }

    private static int binarySearch(int start, int end) {
        int result = end;

        while (start <= end) {
            int mid = (start + end) / 2;
            int bluRay = 1;
            int sum = 0;
            
            for (int n : A) {
                if (sum + n > mid) {
                    bluRay++;
                    sum = 0;
                }
                sum += n;
            }

            if (bluRay <= M) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}