import java.util.*;
import java.io.*;

class Main {
    static int[] basket;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

        basket = new int[N];

        for(int n=0; n<M; n++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) -1;
            int j = Integer.parseInt(st.nextToken()) -1;
            int k = Integer.parseInt(st.nextToken());

            putBall(i, j, k);
        }
		
		StringBuilder sb = new StringBuilder();
		
		for(int number : basket){
            sb.append(number).append(" ");
		}

        System.out.print(sb.toString());
    }

    private static void putBall(int i, int j, int k){
        for(int n=i; n<=j; n++){
            basket[n] = k;
        }
    }
}