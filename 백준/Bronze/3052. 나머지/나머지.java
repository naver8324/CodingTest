import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            int remainder = number % 42;
            remainders.add(remainder);
        }

        System.out.println(remainders.size());
        sc.close();
    }
}
