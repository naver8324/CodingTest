import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] fruits = new int[N];
		Map<Integer, Integer> fruitsCount = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0; i<N; i++){
			fruits[i] = Integer.parseInt(st.nextToken());
		}


        int maxLength = 0;
        int left = 0;

        for(int right=0; right<N; right++){
            fruitsCount.put(fruits[right], fruitsCount.getOrDefault(fruits[right], 0) + 1);

            while(fruitsCount.size() > 2){
                fruitsCount.put(fruits[left], fruitsCount.get(fruits[left])-1);
                
                if(fruitsCount.get(fruits[left]) == 0){
                    fruitsCount.remove(fruits[left]);    
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        
		System.out.print(maxLength);
	}
}