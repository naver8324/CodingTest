import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        
        String minWord = "z".repeat(word.length());
        
        for (int i = 1; i < word.length() - 1; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                String part1 = new StringBuilder(word.substring(0, i)).reverse().toString();
                String part2 = new StringBuilder(word.substring(i, j)).reverse().toString();
                String part3 = new StringBuilder(word.substring(j)).reverse().toString();
                
                String newWord = part1 + part2 + part3;
                
                if (newWord.compareTo(minWord) < 0) {
                    minWord = newWord;
                }
            }
        }
        
        System.out.println(minWord);
        scanner.close();
    }
}
