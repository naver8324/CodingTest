import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] alphabet = new boolean[26];
            boolean isGroupWord = true;
            char prevChar = word.charAt(0);
            alphabet[prevChar - 'a'] = true;

            for (int j = 1; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                if (prevChar != currentChar && alphabet[currentChar - 'a']) {
                    isGroupWord = false;
                    break;
                }

                alphabet[currentChar - 'a'] = true;
                prevChar = currentChar;
            }

            if (isGroupWord) result++;
        }

        System.out.println(result);
        br.close();
    }
}
