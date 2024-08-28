import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] selection = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            selection[i] = N.charAt(i) - '0';
        }

        for (int j = 0; j < selection.length - 1; j++) {
            int maximumIndex = j;
            for (int i = j + 1; i < selection.length; i++) {
                if (selection[i] > selection[maximumIndex]) {
                    maximumIndex = i;
                }
            }
            int temp = selection[j];
            selection[j] = selection[maximumIndex];
            selection[maximumIndex] = temp;
        }

        for (int i : selection) {
            System.out.print(i);
        }
        br.close();
    }
}
