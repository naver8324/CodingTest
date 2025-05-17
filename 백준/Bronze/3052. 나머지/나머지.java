import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	Set<Integer> remainderCount = new HashSet<>();
    	for(int i=0; i<10; i++){
    		int n = Integer.parseInt(br.readLine());	
    		if(n < 42){
    			remainderCount.add(n);
    		}else{
    			remainderCount.add(n%42);
    		}
    	}

    	System.out.print(remainderCount.size());
        br.close();
    }
}
