import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
        int[] count = new int[26];

		for(int i=0; i<word.length(); i++){
            int n = word.charAt(i) - 'A';
            count[n]++;
		}

        int max = 0;
        int maxIndex = 0;
        int check = 0;

        for(int i = 0; i < 26; i++){
            if(count[i] > max){
                max = count[i];
                maxIndex = i;
            }
        }

        for(int n : count){
            if(n == max){
                check++;
            }
        }

        if(check > 1){
            System.out.print("?");
        }else{
            System.out.print((char) (maxIndex + 'A'));
        }
	}
}