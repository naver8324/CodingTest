import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        char[][] dial = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
                {'J', 'K', 'L'},
                {'M', 'N', 'O'},
                {'P', 'Q', 'R', 'S'},
                {'T', 'U', 'V'},
                {'W', 'X', 'Y', 'Z'}
        };

        int result = 0;

        for (char c : input) {
            for (int i = 0; i < dial.length; i++) {
                for (int j = 0; j < dial[i].length; j++) {
                    if (c == dial[i][j]) {
                        result += i + 3;
                        i = dial.length;
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
