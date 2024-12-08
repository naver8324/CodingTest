import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people.add(new Person(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        people.sort(Comparator.comparingInt(Person::getAge));

        StringBuilder sb = new StringBuilder();
        for (Person person : people) {
            sb.append(person.getAge()).append(" ").append(person.getName()).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
