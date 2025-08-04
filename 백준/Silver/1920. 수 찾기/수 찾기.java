import java.io.*;
import java.util.*;

class Main {
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            boolean check = binarySearch(Integer.parseInt(st.nextToken()));
            sb.append(check ? 1 : 0).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static boolean binarySearch(int n) {
        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (n < A[mid]) {
                end = mid - 1;
            } else if (n > A[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}