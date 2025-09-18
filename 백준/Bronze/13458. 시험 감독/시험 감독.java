import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken()); 
        
        long result = 0;
        
        for (int i = 0; i < N; i++) {
            result++;
            int remain = A[i] - B;
            
            if (remain > 0) {
                result += remain / C;
                if (remain % C != 0) result++;
            }
        }
        
        System.out.println(result);
    }
}
