import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j = br.readLine().length();
        int d = br.readLine().length();

        System.out.println(j >= d ? "go" : "no");
    }
}
