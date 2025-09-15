import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;  
        int min = Integer.MAX_VALUE;  
        boolean hasOdd = false; 

        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if (num % 2 == 1) { 
                sum += num;
                if (num < min) {
                    min = num;
                }
                hasOdd = true;
            }
        }

        if (!hasOdd) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }
}
