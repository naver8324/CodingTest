import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        Arrays.sort(dwarf);

        while (sum != 100) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i != j) {
                        if (sum - dwarf[i] - dwarf[j] == 100) {
                            dwarf[i] = 0;
                            dwarf[j] = 0;
                            sum = 100;
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int n : dwarf) {
            if (n != 0) {
                sb.append(n).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}