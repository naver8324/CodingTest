import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

        int profit = C - B;
        int count = 0;

        if(profit <= 0){
            System.out.println(-1);
            return;
        }
        
		while(A >= 0){
            A -= profit;
            count++;
        }

        System.out.print(count);
    }
}