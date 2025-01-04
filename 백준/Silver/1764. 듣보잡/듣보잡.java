import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> unheardPeople = new HashSet<>();
        Set<String> unseenPeople = new HashSet<>();

        for (int i = 0; i < N; i++) {
            unheardPeople.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            unseenPeople.add(br.readLine());
        }

        unheardPeople.retainAll(unseenPeople);
        sb.append(unheardPeople.size()).append("\n");

        ArrayList<String> neverHeardSeenPeople = new ArrayList<>(unheardPeople);
        Collections.sort(neverHeardSeenPeople);

        for (String s : neverHeardSeenPeople) {
            sb.append(s).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}
