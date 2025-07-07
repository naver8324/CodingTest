import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for(int i=N; i>0; i--){
			sb.append(i).append("\n");
		}
		
	
		System.out.print(sb.toString());
	}
}