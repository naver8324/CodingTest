import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BubbleData[] bubble = new BubbleData[N];

        for (int i = 0; i < N; i++) {
            bubble[i] = new BubbleData(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(bubble);

        int maximum = 0;

        for (int i = 0; i < N; i++) {
            if (maximum < bubble[i].index - i) {
                maximum = bubble[i].index - i;
            }
        }
        System.out.println(maximum + 1);

        br.close();
    }
}

class BubbleData implements Comparable<BubbleData> {
    int value;
    int index;

    public BubbleData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(BubbleData o) {
        return this.value - o.value;
    }
}