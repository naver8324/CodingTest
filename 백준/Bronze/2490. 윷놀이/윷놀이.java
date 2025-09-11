import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    
    	for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
    		int count = 0;

    		for(int j=0; j<4; j++){
    			int yut = Integer.parseInt(st.nextToken());
    			if(yut == 0){
    				count++;
    			}
    		}
    		char answer;
    		if(count == 0){
    			answer = 'E';
    		}else if(count == 1){
    			answer = 'A';
    		}else if(count == 2){
    			answer = 'B';
    		}else if(count == 3){
    			answer = 'C';
    		}else{
    			answer = 'D';
    		}
    
    		sb.append(answer).append("\n");
        }
    	
    	System.out.print(sb.toString());
    }
}
