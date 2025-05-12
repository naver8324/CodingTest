import java.util.*;

public class Main {
    static final int MAX = 100001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] time = new int[MAX];
        Arrays.fill(time, -1);
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(N);
        time[N] = 0;

        while (!deque.isEmpty()) {
            int cur = deque.poll();

            if (cur == K) {
                break;
            }
            
            int teleport = cur * 2;
            if (teleport < MAX && time[teleport] == -1) {
                time[teleport] = time[cur];
                deque.offerFirst(teleport);
            }

            int[] nextMoves = {cur - 1, cur + 1};
            for (int next : nextMoves) {
                if (next >= 0 && next < MAX && time[next] == -1) {
                    time[next] = time[cur] + 1;
                    deque.offerLast(next);
                }
            }
        }

        System.out.println(time[K]);
    }
}
