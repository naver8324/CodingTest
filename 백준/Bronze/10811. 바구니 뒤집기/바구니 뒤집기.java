import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 연산 횟수

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 1부터 N까지 초기화
        }

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt() - 1; // 인덱스는 0부터 시작하므로 -1
            int j = sc.nextInt() - 1;

            // i부터 j까지 뒤집기
            while (i < j) {
                int temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;
                i++;
                j--;
            }
        }

        for (int num : baskets) {
            System.out.print(num + " ");
        }
    }
}
