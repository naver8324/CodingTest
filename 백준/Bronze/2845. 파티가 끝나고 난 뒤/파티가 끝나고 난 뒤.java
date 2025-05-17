import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    
    	int L = Integer.parseInt(st.nextToken());
    	int P = Integer.parseInt(st.nextToken());
    
    	int peopleCount = L * P;
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<5; i++){
    		int participantCount = Integer.parseInt(st.nextToken());
    		sb.append(participantCount - peopleCount).append(" ");
    	}
    
    	System.out.println(sb.toString());
    	br.close();
    }
}