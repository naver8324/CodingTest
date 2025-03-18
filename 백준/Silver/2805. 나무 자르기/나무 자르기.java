import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] tress;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        tress = new int[N];
        st = new StringTokenizer(br.readLine());

        int max = 0;
        for (int i = 0; i < N; i++) {
            tress[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tress[i]);
        }

        System.out.println(binarySearch(tress, M, max));
    }

    private static int binarySearch(int[] tress, int target, int maxHeight) {
        int left = 0, right = maxHeight;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long wood = getWood(tress, mid);

            if (target == wood) {
                answer = mid;
                break;
            }
            else if (target < wood) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    private static long getWood(int[] tress, int height) {
        long total = 0;

        for (int tree : tress) {
            if (tree > height) {
                total += tree - height;
            }
        }

        return total;
    }

}
