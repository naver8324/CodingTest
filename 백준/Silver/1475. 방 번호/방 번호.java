import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();
        
        int[] count = new int[10];
        
        for (char c : N.toCharArray()) {
            int num = c - '0';
            count[num]++;
        }
        
        count[6] = (count[6] + count[9] + 1) / 2;
        count[9] = 0;
        
        int maxSet = 0;
        for (int i = 0; i < 9; i++) {
            maxSet = Math.max(maxSet, count[i]);
        }
        
        System.out.println(maxSet);
    }
}
