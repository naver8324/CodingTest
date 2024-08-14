import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        int count = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            int start_index = 0;
            int end_index = N - 1;
            int M = arr[i];

            while (start_index < end_index) {
                if (arr[start_index] + arr[end_index] == M) {
                    if(start_index != i && end_index != i) {
                        count++;
                        break;
                    }else if(start_index == i) {
                        start_index++;
                    }else if(end_index == i) {
                        end_index--;
                    }
                } else if (arr[start_index] + arr[end_index] > M) {
                    end_index--;
                } else {
                    start_index++;
                }
            }
        }

        System.out.println(count);
        bf.close();
    }
}