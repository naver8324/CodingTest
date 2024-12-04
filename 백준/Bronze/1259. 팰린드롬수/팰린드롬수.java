import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String palindrome = sc.nextLine();
            if (palindrome.equals("0")) {
                break;
            }
            System.out.println(new StringBuilder(palindrome).reverse().toString().equals(palindrome) ? "yes" : "no");
        }

        sc.close();
    }
}
