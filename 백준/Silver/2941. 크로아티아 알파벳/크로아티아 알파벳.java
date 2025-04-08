import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String input = br.readLine();

		for(String alphabet : croatianAlphabets){
			input = input.replace(alphabet, "a");
		}
		
		System.out.println(input.length());
	}
}