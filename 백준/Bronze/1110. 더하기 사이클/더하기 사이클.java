import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int original = N;
        int count = 0;

        do{
            int tens = N / 10;
            int units = N % 10;
            int sum = tens + units;
            N = (units * 10) + (sum % 10);
            count++;
        }while(N != original);
		
		System.out.print(count);
	}
}