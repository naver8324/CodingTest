import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int M  = Integer.parseInt(st.nextToken());

        if(M < 45){
            M = M + 60 - 45;
            if(H == 0){
                H = 24 - 1;
            }else{
                H -= 1;
            }
        }else{
            M -= 45;
        }

        sb.append(H).append(" ").append(M);
        System.out.println(sb.toString());
        br.close();
    }
}