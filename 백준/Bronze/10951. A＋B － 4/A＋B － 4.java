import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            sb.append(A + B).append("\n");
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
