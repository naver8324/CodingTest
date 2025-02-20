import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int switchCount = Integer.parseInt(br.readLine());
        int[] onOff = new int[switchCount];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < switchCount; i++) {
            onOff[i] = Integer.parseInt(st.nextToken());
        }

        int studentCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentCount; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                for (int j = 0; j < switchCount; j++) {
                    if ((j + 1) % number == 0) {
                        change(onOff, j);
                    }
                }
            } else {
                number--;
                change(onOff, number);
                int x = 1;

                while (number - x >= 0 && number + x < switchCount && onOff[number - x] == onOff[number + x]) {
                    change(onOff, number - x);
                    change(onOff, number + x);
                    x++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= switchCount; i++) {
            sb.append(onOff[i - 1]).append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
        br.close();
    }

    private static void change(int[] onOff, int n) {
        if (onOff[n] == 1) {
            onOff[n] = 0;
        } else {
            onOff[n] = 1;
        }
    }
}
