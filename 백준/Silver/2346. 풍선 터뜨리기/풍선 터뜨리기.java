import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] papers = new int[n];

        for (int i = 0; i < n; i++) {
            papers[i] = scanner.nextInt();
        }

        LinkedList<Integer> balloons = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            balloons.add(i + 1);
        }

        int index = 0;
        while (!balloons.isEmpty()) {
            // 현재 풍선의 번호와 그 풍선 안에 적힌 숫자
            int currentBalloon = balloons.remove(index);
            if (!balloons.isEmpty()) {
                System.out.print(currentBalloon + " ");
            }


            if (balloons.isEmpty()) {
                System.out.print(currentBalloon);
                break;
            }

            int move = papers[currentBalloon - 1];
            if (move > 0) {
                index = (index + (move - 1)) % balloons.size();
            } else {
                index = (index + move) % balloons.size();
                if (index < 0) {
                    index += balloons.size();
                }
            }
        }
    }
}
