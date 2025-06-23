import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int start = 1;
        int end = 1;
        int sum = 0;
        int count = 0;

        while(start <= N){
            if (sum == N) {
                count++;
                sum += end;
                end++;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                sum += end;
                end++;
            }
        }

        System.out.println(count);
    }
}