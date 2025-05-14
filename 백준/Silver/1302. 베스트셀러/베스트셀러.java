import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        
        Map<String, Integer> bookMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String title = sc.nextLine();
            bookMap.put(title, bookMap.getOrDefault(title, 0) + 1);
        }

        int maxCount = 0;
        String bestSeller = "";

        for (Map.Entry<String, Integer> entry : bookMap.entrySet()) {
            String title = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                bestSeller = title;
            } else if (count == maxCount) {
                if (title.compareTo(bestSeller) < 0) {
                    bestSeller = title;
                }
            }
        }

        System.out.println(bestSeller);
    }
}
