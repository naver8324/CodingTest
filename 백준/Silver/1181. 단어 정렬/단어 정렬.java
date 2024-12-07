import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> strings = new ArrayList<>(set);

        strings.sort(((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return Integer.compare(o1.length(), o2.length());
        }));

        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
