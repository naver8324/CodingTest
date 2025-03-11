import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("-");

        int result = 0;

        String[] expression = N[0].split("\\+");

        for (String s : expression) {
            result += Integer.parseInt(s);
        }

        for (int i = 1; i < N.length; i++) {
            expression = N[i].split("\\+");

            for (String s : expression) {
                result -= Integer.parseInt(s);
            }
        }

        System.out.println(result);
    }
}