import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){
            String input = br.readLine();
            if (input.equals(".")){
                break;
            }

            if (isBalanced(input)) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty() ||
                    (c == ')' && stack.peek() != '(') ||
                    (c == ']' && stack.peek() != '[')) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
