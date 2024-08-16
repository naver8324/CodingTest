import java.io.*;
import java.util.*;

public class Main {

    static int[] minCount = new int[4];
    static int[] currentCount = new int[4];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] dna;

        dna = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());

        for(int i=0; i<4; i++){
            minCount[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < P; i++) {
            Add(dna[i]);
        }

        Check();

        for (int end_index = P; end_index < S; end_index++) {
            int start_index = end_index - P;
            Add(dna[end_index]);
            Remove(dna[start_index]);
            Check();
        }

        System.out.println(count);
        bf.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                currentCount[0]--;
                break;
            case 'C':
                currentCount[1]--;
                break;
            case 'G':
                currentCount[2]--;
                break;
            case 'T':
                currentCount[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                currentCount[0]++;
                break;
            case 'C':
                currentCount[1]++;
                break;
            case 'G':
                currentCount[2]++;
                break;
            case 'T':
                currentCount[3]++;
                break;
        }
    }

    private static void Check() {
        for(int i = 0; i < 4; i++){
            if(currentCount[i] < minCount[i]) {
                return;
            }
        }
        count++;
    }
}