import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list.add(new Student(name, korean, english, math));
        }

        list.sort((a, b) -> {
            if (b.korean != a.korean) {
                return b.korean - a.korean;
            }
            if (a.english != b.english) {
                return a.english - b.english;
            }
            if (b.math != a.math) {
                return b.math - a.math;
            }
            return a.name.compareTo(b.name);
        });

        StringBuilder sb = new StringBuilder();

        for (Student s : list) {
            sb.append(s.name).append("\n");
        }

        System.out.print(sb.toString());
    }
}

class Student {
    String name;
    int korean;
    int english;
    int math;


    Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}