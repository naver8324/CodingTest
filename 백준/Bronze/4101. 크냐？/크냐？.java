import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            if (one == 0 && two == 0) {
                break;
            } else if (one > two) {
                sb.append("Yes");
            } else {
                sb.append("No");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
