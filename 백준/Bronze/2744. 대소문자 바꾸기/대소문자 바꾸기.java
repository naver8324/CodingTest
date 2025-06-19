import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] s = br.readLine().toCharArray();

        for(char c : s){
            if(c >= 97){
                bw.write(c-32);
            }else{
                bw.write(c+32);
            }
        }

        bw.flush();
	}
}