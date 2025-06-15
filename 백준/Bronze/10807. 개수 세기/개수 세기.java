import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		for(int i=0; i<N; i++){
            int n = Integer.parseInt(st.nextToken());
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

        int v = Integer.parseInt(br.readLine());
        System.out.println(map.getOrDefault(v, 0));
	}
}