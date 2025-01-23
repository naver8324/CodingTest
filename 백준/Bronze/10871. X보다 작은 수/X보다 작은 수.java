import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int X = Integer.parseInt(st.nextToken());
    	StringBuilder sb = new StringBuilder();
    	st = new StringTokenizer(br.readLine());
    
    	for(int i=0; i<N; i++){
    		int n = Integer.parseInt(st.nextToken());
    		if(n < X){
    			sb.append(n).append(" ");
    		}
    	}
    
    	System.out.print(sb.toString());
        br.close();
    }
}
