import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    
    	int n1 = Integer.parseInt(br.readLine());
    	String n2 = br.readLine();
    	int mul = n1 * Integer.parseInt(n2);
    
    	for(int i=n2.length() - 1; i >= 0; i--){
    		int digit = n2.charAt(i) - '0';
    		sb.append(n1*digit).append("\n");
    		
    	}
    	
    	sb.append(mul);
    
    	System.out.print(sb.toString());
        br.close();
    }
}
