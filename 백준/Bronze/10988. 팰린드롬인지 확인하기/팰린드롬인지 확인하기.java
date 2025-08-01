import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean check = true;

        int j = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(j)) {
                check = false;
            }

            j--;
        }

        System.out.println(check ? 1 : 0);
    }
}