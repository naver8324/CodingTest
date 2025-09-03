import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] triangle = new int[3];
            triangle[0] = Integer.parseInt(st.nextToken());
            triangle[1] = Integer.parseInt(st.nextToken());
            triangle[2] = Integer.parseInt(st.nextToken());

            if (triangle[0] + triangle[1] + triangle[2] == 0) break;

            Arrays.sort(triangle);

            if (triangle[2] >= triangle[0] + triangle[1]) {
                sb.append("Invalid");
            } else if (triangle[0] == triangle[1] && triangle[1] == triangle[2]) {
                sb.append("Equilateral");
            } else if (triangle[0] == triangle[1] || triangle[1] == triangle[2]) {
                sb.append("Isosceles");
            } else {
                sb.append("Scalene");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
