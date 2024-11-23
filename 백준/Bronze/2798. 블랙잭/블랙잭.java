import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = new int[N];
        int sum = 0;
        int closest = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        outerLoop:
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = card[i] + card[j] + card[k];

                    if (sum == M) { // 가장 인접한 값(=같은값) 찾으면 반복문 즉시 종료
                        closest = sum;
                        break outerLoop;
                    }

                    if (sum < M && sum > closest) {
                        closest = sum;
                    }
                }
            }
        }
        System.out.println(closest);
        br.close();
    }
}