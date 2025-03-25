import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String board = scanner.next();
        scanner.close();
        
        String result = solvePolyomino(board);
        System.out.println(result);
    }
    
    public static String solvePolyomino(String board) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        while (i < board.length()) {
            if (board.charAt(i) == 'X') {
                int count = 0;
                while (i < board.length() && board.charAt(i) == 'X') {
                    count++;
                    i++;
                }
                
                if (count % 2 != 0) return "-1";
                
                sb.append("AAAA".repeat(count / 4));
                if (count % 4 == 2) sb.append("BB");
            } else {
                sb.append(".");
                i++;
            }
        }
        
        return sb.toString();
    }
}
