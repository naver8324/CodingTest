import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String id = br.readLine();
        
		StringBuilder sb = new StringBuilder();
		sb.append(id).append("??!");
		
		System.out.print(sb.toString());
	}
}