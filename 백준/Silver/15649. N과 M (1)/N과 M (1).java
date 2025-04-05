import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[] selected;
    static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

    	selected = new int[M];
        visited = new boolean[N + 1];

    	backtrack(0);
        
        System.out.print(sb.toString());
    }

    static void backtrack(int depth){
        if(depth == M){
            for(int n : selected){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=N; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}
