import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int zeroCount = 0, oneCount = 0;
        int prevChar = s.charAt(0);

        if (prevChar == '0') {
            zeroCount++;
        } else {
            oneCount++;
        }

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != prevChar) {
                if (currentChar == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }
                prevChar = currentChar;
            }
        }

        System.out.println(Math.min(oneCount, zeroCount));
    }
}
