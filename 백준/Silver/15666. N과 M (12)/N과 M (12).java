import java.util.*;

public class Main {
    static int N, M;
    static int[] nums;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        nums = set.stream().mapToInt(i -> i).toArray();
        Arrays.sort(nums);

        selected = new int[M];
        backtrack(0, 0);

        System.out.print(sb.toString());
    }

    static void backtrack(int depth, int startIdx) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = startIdx; i < nums.length; i++) {
            selected[depth] = nums[i];
            backtrack(depth + 1, i);
        }
    }
}
