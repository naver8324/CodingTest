import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] X = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedX = X.clone();
        sortedX = Arrays.stream(sortedX).distinct().toArray();
        Arrays.sort(sortedX);

        StringBuilder sb = new StringBuilder();

        for (int i : X) {
            sb.append(Arrays.binarySearch(sortedX, i)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
