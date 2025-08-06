import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (x1 == x2) {
            sb.append(x3);
        } else if (x1 == x3) {
            sb.append(x2);
        } else {
            sb.append(x1);
        }

        sb.append(" ");

        if (y1 == y2) {
            sb.append(y3);
        } else if (y1 == y3) {
            sb.append(y2);
        } else {
            sb.append(y1);
        }

        System.out.println(sb.toString());
    }
}