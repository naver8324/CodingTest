import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examCount = sc.nextInt();
        int[] examScores = new int[examCount];
        double sum = 0;

        for (int i = 0; i < examCount; i++) {
            examScores[i] = sc.nextInt();
            sum += examScores[i];
        }

        int max = Arrays.stream(examScores).max().orElseThrow();

        System.out.println(sum * 100 / max / examCount);
    }
}
