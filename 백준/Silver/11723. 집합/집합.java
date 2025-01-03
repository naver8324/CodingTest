import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "add":
                    set.add(Integer.parseInt(input[1]));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(input[1]));
                    break;
                case "check":
                    int n = set.contains(Integer.parseInt(input[1])) ? 1 : 0;
                    sb.append(n).append("\n");
                    break;
                case "toggle":
                    if (!set.remove(Integer.parseInt(input[1]))) {
                        set.add(Integer.parseInt(input[1]));
                    }
                    break;
                case "all":
                    for (int x = 1; x <= 20; x++) {
                        set.add(x);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }


        System.out.print(sb.toString());
        br.close();
    }
}
