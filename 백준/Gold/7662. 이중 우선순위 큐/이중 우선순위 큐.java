import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            while (k-- > 0) {
                String[] input = br.readLine().split(" ");
                char c = input[0].charAt(0);
                int n = Integer.parseInt(input[1]);

                if (c == 'I') {
                    treeMap.put(n, treeMap.getOrDefault(n, 0) + 1);
                } else {
                    if (treeMap.isEmpty()) {
                        continue;
                    }

                    int key = n == 1 ? treeMap.lastKey() : treeMap.firstKey();
                    if (treeMap.get(key) == 1) {
                        treeMap.remove(key);
                    } else {
                        treeMap.put(key, treeMap.get(key) - 1);
                    }

                }
            }

            if (treeMap.isEmpty()) {
                sb.append("EMPTY").append("\n");
            } else {
                sb.append(treeMap.lastKey()).append(" ");
                sb.append(treeMap.firstKey()).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}