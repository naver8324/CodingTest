import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int change = 1000 - price;

        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int coin : coins) {
            count += change / coin;
            change %= coin;
        }

        System.out.println(count);
    }
}
