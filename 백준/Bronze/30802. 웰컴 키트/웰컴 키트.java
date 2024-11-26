import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] sizeCount = new int[6];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 6; i++){
            sizeCount[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Tcount = 0;

        for (int i = 0; i < 6; i++) {
            Tcount += (sizeCount[i] + T - 1) / T; // 올림 처리
        }

        System.out.println(Tcount);
        System.out.println(N / P + " " + N % P);

        br.close();
    }
}