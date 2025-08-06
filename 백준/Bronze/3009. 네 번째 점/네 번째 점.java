import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int fourthX = findUnique(x[0], x[1], x[2]);
        int fourthY = findUnique(y[0], y[1], y[2]);

        System.out.println(fourthX + " " + fourthY);
    }

    private static int findUnique(int a, int b, int c) {
        if (a == b) return c;
        else if (a == c) return b;
        else return a;
    }
}
