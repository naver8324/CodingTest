import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        List<List<Integer>> cycles = new ArrayList<>();

        // 0을 따로 빼서 값 입력하는법
//        cycles.put(0, new List<Integer>{10});

        for (int n = 0; n <= 9; n++) {
            List<Integer> cycle = new ArrayList<>();
            int current = n;
            List<Integer> check = new ArrayList<>();

            if (n == 0) {
                cycle.add(10);
                cycles.add(cycle);
                continue;
            }

            while (!check.contains(current)) {
                check.add(current);
                cycle.add(current);
                current = (current * n) % 10;
            }

            cycles.add(cycle);
        }

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int lastDigit = a % 10;
            List<Integer> cycle = cycles.get(lastDigit);
            int size = cycle.size();
            int index = (b % size) - 1;

            if (index == -1) {
                index = size - 1;
            }

            sb.append(cycle.get(index)).append("\n");
        }

        System.out.print(sb.toString());
    }
}