import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] classes = new int[n + 1][6];
        
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                classes[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int candidate = 0;
        int maxShared = -1;
        

        for (int i = 1; i <= n; i++) {
            int count = 0;
            
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                

                for (int grade = 1; grade <= 5; grade++) {
                    if (classes[i][grade] == classes[j][grade]) {
                        count++;
                        break;
                    }
                }
            }
            
            if (count > maxShared) {
                maxShared = count;
                candidate = i;
            }
        }
        
        System.out.println(candidate);
	br.close();
    }
}