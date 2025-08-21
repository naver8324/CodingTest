import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < N.length(); i++) {
            alphabet[N.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : alphabet) {
            sb.append(n).append(" ");
        }

        System.out.println(sb.toString());
    }
}