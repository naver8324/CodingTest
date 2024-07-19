import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String numbers = sc.nextLine();
        int sum = 0;

        for (String i : numbers.split("")) {
            sum += Integer.parseInt(i);
        }

        System.out.println(sum);
    }
}
