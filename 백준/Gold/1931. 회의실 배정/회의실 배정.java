import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Meeting> meetings = new ArrayList<>();
        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            meetings.add(new Meeting(start, end));
        }

        meetings.sort((a, b) -> {
            if (a.end != b.end) {
                return a.end - b.end;
            } else {
                return a.start - b.start;
            }
        });

        int now = 0;

        for (Meeting m : meetings) {
            if (now <= m.start) {
                maxCount++;
                now = m.end;
            }
        }

        System.out.println(maxCount);
    }
}

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
