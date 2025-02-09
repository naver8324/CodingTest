import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String word = br.readLine();

        int documentLength = document.length();
        int wordLength = word.length();

        document = document.replaceAll(word, "");

        System.out.println((documentLength - document.length()) / wordLength);
        br.close();
    }
}
