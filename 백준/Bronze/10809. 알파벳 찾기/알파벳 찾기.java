import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int[] alphabet = new int[26];
    	Arrays.fill(alphabet, -1);
    	String str = br.readLine();
    	for(int i=0; i<str.length(); i++){
            int index = str.charAt(i)-97;
            if(alphabet[index] == -1){
                alphabet[index] = i;
            }
    	}

        StringBuilder sb = new StringBuilder();
        for(int i : alphabet){
            sb.append(i).append(" ");
        }
    	System.out.print(sb.toString());
        br.close();
    }
}
