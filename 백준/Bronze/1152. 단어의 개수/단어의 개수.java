import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.split(" ");
            System.out.println(words.length);
        }
        br.close();
    }
}