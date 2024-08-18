import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int num = 1;
        Stack<Integer> sequence = new Stack<>();

        for (int i = 0; i < n; i++) {
            int now = sc.nextInt();

            while (now >= num) {
                sequence.push(num);
                sb.append("+\n");
                num++;
            }

            if (now != sequence.pop()) {
                break;
            }
            sb.append("-\n");
        }

        if (sequence.isEmpty()) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}