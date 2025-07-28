import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

        if(N == 1){
            return;
        }
		
		StringBuilder sb = new StringBuilder();

        while(N > 1){
            for(int i=2; i<=N; i++){
                if(N % i == 0){
                    sb.append(i).append("\n");
                    N /= i;
                    break;
                }
    		}
        }
		

        System.out.print(sb.toString());
    }
}