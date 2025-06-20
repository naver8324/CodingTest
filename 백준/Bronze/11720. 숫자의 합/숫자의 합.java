import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;

        for (String s : num.split("")) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}