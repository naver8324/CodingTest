import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startNote = Integer.parseInt(st.nextToken());
        int expectedNote = 0;

        for (int i = 1; i < 8; i++) {
            if (startNote == 1) {
                expectedNote = i + 1;
            } else if (startNote == 8) {
                expectedNote = 8 - i;
            }

            int note = Integer.parseInt(st.nextToken());
            if (expectedNote != note) {
                System.out.println("mixed");
                return;
            }
        }

        System.out.println(startNote == 1 ? "ascending" : "descending");
        br.close();
    }
}