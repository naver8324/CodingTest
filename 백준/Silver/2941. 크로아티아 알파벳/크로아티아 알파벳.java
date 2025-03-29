import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String croatian : croatianAlphabets) {
            input = input.replace(croatian, "*");
        }
        
        System.out.println(input.length());
    }
}
