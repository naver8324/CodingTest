import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int divisorCount = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < divisorCount; i++) {
            int divisor = Integer.parseInt(st.nextToken());
            min = Math.min(min, divisor);
            max = Math.max(max, divisor);
        }

        System.out.println(min * max);
    }
}
