import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int excludedCount = (int) Math.round(n*0.15);
        int[] level = new int[n];

        for (int i = 0; i < n; i++) {
            level[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(level);

        double average = 0;

        for (int i = excludedCount; i < n-excludedCount; i++) {
            average += level[i];
        }

        System.out.println(Math.round(average/(n - excludedCount * 2)));
        
        br.close();
    }
}