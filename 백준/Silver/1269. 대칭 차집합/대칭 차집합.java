import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> tempA = new HashSet<>(setA);
        Set<Integer> tempB = new HashSet<>(setB);

        tempA.removeAll(setB);
        tempB.removeAll(setA);

        System.out.println(tempA.size() + tempB.size());
        br.close();
    }
}
