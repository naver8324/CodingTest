import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vowels = "aeiouAEIOU";
        
        while (true) {
            String line = br.readLine();
            if (line.equals("#")) {
                break;
            }
            
            int count = 0;
            for (char c : line.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        br.close();
    }
}
