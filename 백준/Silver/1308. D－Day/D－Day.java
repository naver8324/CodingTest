import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int y2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        if (y2 > y1 + 1000 || (y2 == y1 + 1000 && (m2 > m1 || (m2 == m1 && d2 >= d1)))) {
            System.out.println("gg");
        } else {
            LocalDate today = LocalDate.of(y1, m1, d1);
            LocalDate d_day = LocalDate.of(y2, m2, d2);
            long days = ChronoUnit.DAYS.between(today, d_day);
            System.out.println("D-" + days);
        }

        br.close();
    }
}
