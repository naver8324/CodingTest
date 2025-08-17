import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cheapestBurger = Integer.MAX_VALUE;
        int cheapestBeverage = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            cheapestBurger = Math.min(cheapestBurger, Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < 2; i++) {
            cheapestBeverage = Math.min(cheapestBeverage, Integer.parseInt(br.readLine()));
        }

        System.out.print(cheapestBurger + cheapestBeverage - 50);
    }
}