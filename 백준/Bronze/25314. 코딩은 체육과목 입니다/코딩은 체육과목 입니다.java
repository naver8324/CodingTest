import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) / 4;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("long").append(" ");
        }
        sb.append("int");

        System.out.println(sb.toString());
    }
}