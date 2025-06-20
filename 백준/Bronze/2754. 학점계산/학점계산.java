import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double average = 0.0;

        switch (s) {
            case "A+": average = 4.3; break;
            case "A0": average = 4.0; break;
            case "A-": average = 3.7; break;
            case "B+": average = 3.3; break;
            case "B0": average = 3.0; break;
            case "B-": average = 2.7; break;
            case "C+": average = 2.3; break;
            case "C0": average = 2.0; break;
            case "C-": average = 1.7; break;
            case "D+": average = 1.3; break;
            case "D0": average = 1.0; break;
            case "D-": average = 0.7; break;
            default:   average = 0.0; break;
        }

        System.out.println(average);
    }
}
