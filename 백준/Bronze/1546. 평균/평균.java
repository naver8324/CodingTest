import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examCount = sc.nextInt();
        int[] examScores = new int[examCount];

        for (int i = 0; i < examCount; i++) {
            examScores[i] = sc.nextInt();
        }
        int max = Arrays.stream(examScores).max().orElseThrow();
        double average = 0;

        for (int n : examScores) {
            average += (double) n /max*100;
        }

        System.out.println(average/examCount);
    }
}
