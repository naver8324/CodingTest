import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());	
    	int sum = 0;
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	int[] arr = new int[N];
    	Map<Integer, Integer> map = new HashMap<>();
        	
        for(int i=0; i<N; i++){
        	int input = Integer.parseInt(br.readLine());
            if(input < min){
                min = input;
            }
            if(input > max){
                max = input;
            }
        	sum += input;
        	arr[i] = input;
    
        	map.put(input, map.getOrDefault(input, 0) + 1);
        }
        Arrays.sort(arr);
    
    	int maxFrequency = 0;
    	List<Integer> list = new ArrayList<>();
        
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    		int value = entry.getKey();
    		int frequency = entry.getValue();
    
    		if(frequency > maxFrequency){
    			maxFrequency = frequency;
    			list.clear();
    			list.add(value);
    		}else if(frequency == maxFrequency){
    			list.add(value);
    		}
    	}
    	Collections.sort(list);
    	int mode = (list.size() > 1) ? list.get(1) : list.get(0);
    
        StringBuilder sb = new StringBuilder();
        sb.append(Math.round((double) sum/N)).append("\n");
        sb.append(arr[N/2]).append("\n");
    	sb.append(mode).append("\n");
        sb.append(max-min).append("\n");
    	
    	System.out.print(sb.toString());
        br.close();
    }
}
