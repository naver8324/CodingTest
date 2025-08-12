import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] splitMinus = input.split("-");
        int answer = 0;

        String[] firstPlus = splitMinus[0].split("\\+");

        for (String n : firstPlus) {
            answer += Integer.parseInt(n);
        }

        for (int i = 1; i < splitMinus.length; i++) {
            String[] splitPlus = splitMinus[i].split("\\+");

            for (String plus : splitPlus) {
                answer -= Integer.parseInt(plus);
            }
        }

        System.out.println(answer);
    }
}