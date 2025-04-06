import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

    	if(N == 1){
    		System.out.println(0);
    		return;
    	}
    	
    	int dasom = Integer.parseInt(br.readLine());
    	int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    
    	for(int i=1; i<N; i++){
    		pq.offer(Integer.parseInt(br.readLine()));
    	}
    
    	while(!pq.isEmpty() && pq.peek() >= dasom){
            pq.offer(pq.poll()-1);
            dasom++;
            count++;
    	}

        System.out.println(count);
	
    }
}
