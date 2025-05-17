import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        for (; L <= 100; L++) {
            int numerator = N - (L * (L - 1) / 2);
            
            if (numerator < 0) continue;
            
            if (numerator % L == 0) {
                int x = numerator / L;
                
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < L; i++) {
                    sb.append(x + i).append(" ");
                }
                System.out.println(sb.toString());
                return;
            }
        }
        
        System.out.println(-1);
    }
}
