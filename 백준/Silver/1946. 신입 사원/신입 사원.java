import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            Employee[] arr = new Employee[N];
            int count = 1;

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int g = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                arr[j] = new Employee(g, r);
            }

            Arrays.sort(arr);

            int min = arr[0].rank;

            for (int j = 1; j < N; j++) {
                if (arr[j].rank < min) {
                    min = arr[j].rank;
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }
}

class Employee implements Comparable<Employee>{
    int grade;
    int rank;

    Employee(int g, int r) {
        grade = g;
        rank = r;
    }

    @Override
    public int compareTo(Employee o) {
        return this.grade - o.grade;
    }
}