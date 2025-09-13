import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
    	int s = Integer.parseInt(br.readLine());

        A += s / 3600;
        s %= 3600;
        B += s / 60;
        s %= 60;
        C += s;

        B += C / 60;
        C %= 60;
        A += B / 60;
        B %= 60;
        A %= 24;

        System.out.println(A + " " + B + " " + C);
    }
}
