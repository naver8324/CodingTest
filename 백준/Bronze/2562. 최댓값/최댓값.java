import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
    	int max = Integer.MIN_VALUE;
    	int index = 0;
	
    	for(int i=1; i<=9; i++){
    		int input = Integer.parseInt(br.readLine());
    		if(max < input){
    			max = input;
    			index = i;
    		}	
    	}
    	System.out.println(max);
    	System.out.println(index);
    	br.close();
    }
}
