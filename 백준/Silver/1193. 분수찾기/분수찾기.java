import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int n = 1;

		while(n * (n + 1) / 2 < X){
			n++;
		}
		
		int index = X - ((n - 1) * n / 2);
			
		System.out.println(n % 2 != 0 ? (n - index + 1) + "/" + index : index + "/" + (n - index + 1));
		sc.close();
	}
}