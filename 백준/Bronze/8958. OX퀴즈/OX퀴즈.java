import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());	
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0; i<N; i++){
    		int totalScore = 0;
    		int score = 1;
    		String quizResult = br.readLine();
    		
    		for(char c : quizResult.toCharArray()){
    			if(c == 'O'){		
    				totalScore += score;
    				score++;
    			}else{
    				score = 1;
    			}
    		}
    		sb.append(totalScore).append("\n");
    	}
    	
    	System.out.print(sb.toString());
        br.close();
    }
}
