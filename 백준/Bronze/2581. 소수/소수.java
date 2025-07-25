import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int sum = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=M; i<=N; i++){
            if(isPrime(i)){
                min = Math.min(min, i);
                sum += i;
            }
		}

        if(min == Integer.MAX_VALUE){
            sb.append(-1);
        }else{
            sb.append(sum).append("\n");
            sb.append(min);
        }

        System.out.print(sb.toString());
    }

    private static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        
        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}