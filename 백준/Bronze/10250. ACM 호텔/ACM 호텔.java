import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int roomNumber = 0;

            if (N % H == 0) {
                roomNumber += H * 100 + (N / H);
            } else {
                roomNumber += N % H * 100 + ((N / H) + 1);
            }

            sb.append(roomNumber).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}