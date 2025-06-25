import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int s = 0;
        
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(br.readLine());

            while(num > s) {
                stack.add(++s);
                sb.append("+").append("\n");
            }

            if (num == stack.peek()) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println(sb.toString());
    }
}