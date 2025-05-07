import java.util.*;

public class Main {
    static int N, M;
    static int[] nums;
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    static Set<String> uniqueSequences = new LinkedHashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N];
        visited = new boolean[N];
        result = new int[M];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        backtrack(0);

        for (String s : uniqueSequences) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }

    static void backtrack(int depth) {
        if (depth == M) {
            StringBuilder seq = new StringBuilder();
            for (int i = 0; i < M; i++) {
                seq.append(result[i]).append(" ");
            }
            uniqueSequences.add(seq.toString().trim());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = nums[i];
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}
