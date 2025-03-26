import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] fruits = new int[N];

        for (int i = 0; i < N; i++) {
            fruits[i] = sc.nextInt();
        }

        System.out.println(getMaxTanghuluLength(fruits, N));
    }

    public static int getMaxTanghuluLength(int[] fruits, int N) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < N; right++) {
            countMap.put(fruits[right], countMap.getOrDefault(fruits[right], 0) + 1);

            while (countMap.size() > 2) {
                countMap.put(fruits[left], countMap.get(fruits[left]) - 1);
                if (countMap.get(fruits[left]) == 0) {
                    countMap.remove(fruits[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
