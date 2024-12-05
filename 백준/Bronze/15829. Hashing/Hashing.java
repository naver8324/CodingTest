import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); sc.nextLine(); // 버퍼 비우기
        String str = sc.nextLine();
        int R = 31;
        int M = 1234567891;
        long result = 0;
        long powerOfR = 1;

        for (int i = 0; i < L; i++) {
            result = (result + (str.charAt(i)-'a'+1) * powerOfR % M) % M;
            powerOfR = powerOfR * R % M;
        }

        System.out.println(result);
        sc.close();
    }
}
