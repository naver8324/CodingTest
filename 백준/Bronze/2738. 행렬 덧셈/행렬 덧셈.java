import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
		int[][] A = new int[N][M];

		for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
		}

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            
            for(int j=0; j<M; j++){
                A[i][j] += Integer.parseInt(st.nextToken());
            }
		}

        for(int[] a : A){
            for(int n : a){
                bw.write(n + " ");
            }
            bw.newLine();
        }

		bw.flush();
	}
}