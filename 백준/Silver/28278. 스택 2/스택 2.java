import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		StringBuilder sb = new StringBuilder();

		for(int i=0; i<N; i++){
			String[] input = br.readLine().split(" ");
	
			switch(Integer.parseInt(input[0])){
				case 1:	
					stack.push(Integer.parseInt(input[1]));
					break;
				case 2:
					sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
					break;
				case 3:
					sb.append(stack.size()).append("\n");
					break;
				case 4:
					sb.append(stack.isEmpty() ? 1 : 0).append("\n");
					break;
				case 5:
					sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }		
		}
		
		System.out.print(sb.toString());
	}
}
