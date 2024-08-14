import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int start_index = 0;
        int end_index = N - 1;
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        while (start_index < end_index) {
            if (arr[start_index] + arr[end_index] == M) {
                count++;
                start_index++;
                end_index--;
            } else if (arr[start_index] + arr[end_index] > M) {
                end_index--;
            } else {
                start_index++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}