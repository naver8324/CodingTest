import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int num = 0;

            if ((int) c >= 65) {
                num = (int) c - 'A' + 10;
            } else {
                num = (int) c - '0';
            }

            result = result * B + num;
        }

        System.out.println(result);
    }
}