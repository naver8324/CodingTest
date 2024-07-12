import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int bakingTime = sc.nextInt();

        minute += bakingTime;

        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }

        if (hour >= 24) {
            hour %= 24;
        }

        System.out.println(hour + " " + minute);

    }
}
