import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> countBooks = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            countBooks.put(book, countBooks.getOrDefault(book, 0) + 1);
        }

        String bestSeller = "";
        int max = 0;

        for (Map.Entry<String, Integer> m : countBooks.entrySet()) {
            String book = m.getKey();
            int count = m.getValue();

            if (count > max) {
                max = count;
                bestSeller = book;
            } else if (count == max) {
                if (book.compareTo(bestSeller) < 0) {
                    bestSeller = book;
                }
            }
        }

        System.out.println(bestSeller);
    }
}