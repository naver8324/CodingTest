import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int yCost = 0, mCost = 0;
        
        for (int i = 0; i < N; i++) {
            int callTime = scanner.nextInt();
            yCost += ((callTime / 30) + 1) * 10;
            mCost += ((callTime / 60) + 1) * 15;
        }
        
        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (yCost > mCost) {
            System.out.println("M " + mCost);
        } else {
            System.out.println("Y M " + yCost);
        }
        
        scanner.close();
    }
}
