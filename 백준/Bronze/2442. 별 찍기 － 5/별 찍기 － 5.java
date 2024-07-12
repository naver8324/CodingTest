import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i=0; i<line; i++){
            int starCount = (i*2) + 1;
            int blankCount = line - (i+1);

            System.out.println(" ".repeat(blankCount)+"*".repeat(starCount));
        }

    }
}
