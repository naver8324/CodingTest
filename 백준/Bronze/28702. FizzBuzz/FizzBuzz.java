import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        for (int i = 3; i > 0; i--) {
            String str = sc.nextLine();
            if (Objects.equals(str, "Fizz") || Objects.equals(str, "Buzz") || Objects.equals(str, "FizzBuzz")) {
                continue;
            } else {
                num = Integer.parseInt(str) + i;
            }
        }
        
        String result;
        if (num % 3 == 0 && num % 5 == 0) {
            result = "FizzBuzz";
        } else if (num % 3 == 0) {
            result = "Fizz";
        } else if (num % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(num);
        }

        System.out.println(result);
        sc.close();
    }
}
