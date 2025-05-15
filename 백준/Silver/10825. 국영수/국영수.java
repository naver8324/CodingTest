import java.util.*;

public class Main {
    static class Student {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();
            students.add(new Student(name, korean, english, math));
        }

        students.sort((a, b) -> {
            if (b.korean != a.korean) {
                return b.korean - a.korean;
            } else if (a.english != b.english) {
                return a.english - b.english;
            } else if (b.math != a.math) {
                return b.math - a.math;
            } else {
                return a.name.compareTo(b.name);
            }
        });

        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
