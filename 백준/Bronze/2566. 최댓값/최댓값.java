import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] numbers = new int[9][9];

        for(int i=0; i < 9; i++){
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                numbers[i][j] = Integer.parseInt(input[j]);
            }
        }

        int maximum = Integer.MIN_VALUE;
        int row = -1, column = -1;
        int[][] answer = new int[2][2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (maximum < numbers[i][j]) {
                    maximum = numbers[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }

        System.out.println(maximum);
        System.out.println(row + " " + column);
    }
}