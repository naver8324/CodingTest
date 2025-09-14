import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(br.readLine());
        int a = 0, b = 0, c = 0;

        if(T % 10 != 0){
            System.out.println(-1);
            return;
        }

        if(T == 0){
            System.out.println(0);
            return;
        }

        a = T / 300;
        T %= 300;
        b = T / 60;
        T %= 60;
        c = T / 10;

        System.out.println(a + " " + b + " " + c);
    }
}
