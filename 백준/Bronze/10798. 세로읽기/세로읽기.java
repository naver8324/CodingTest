import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[5];

        for (int i = 0; i < 5; i++) {
            input[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[j].length() - 1 >= i) {
                    sb.append(input[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
