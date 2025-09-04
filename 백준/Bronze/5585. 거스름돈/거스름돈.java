import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = 1000 - Integer.parseInt(br.readLine());
        int changeCount = 0;
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};

        for (int coin : coins) {
            changeCount += change / coin;
            change %= coin;
        }

        System.out.println(changeCount);
    }
}
