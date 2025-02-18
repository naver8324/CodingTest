import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= B.length() - A.length(); i++) {
            int n = 0;
            String s = B.substring(i, A.length()+i);
            char[] c1 = A.toCharArray();
            char[] c2 = B.toCharArray();

            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != s.charAt(j)) {
                    n++;
                }
            }
            result = Math.min(result, n);
        }

        System.out.println(result);
        br.close();
    }
}
