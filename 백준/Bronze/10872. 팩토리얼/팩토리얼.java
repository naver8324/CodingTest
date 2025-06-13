import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int factorial = 1;
		for(int i=2; i<=N; i++){
			factorial *= i;
		}

		System.out.println(factorial);
	}
}