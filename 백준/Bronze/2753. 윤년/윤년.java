import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if (year % 400 == 0) {
            System.out.println(1);
            return;
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(1);
            return;
        }

        System.out.print(0);
        br.close();
    }
}
