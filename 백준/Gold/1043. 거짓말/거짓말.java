import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;

        int t = sc.nextInt(); 
        List<Integer> truthPeople = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            truthPeople.add(sc.nextInt());
        }

        List<List<Integer>> parties = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            List<Integer> party = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                party.add(sc.nextInt());
            }
            parties.add(party);

            for (int j = 1; j < party.size(); j++) {
                union(party.get(0), party.get(j));
            }
        }

        Set<Integer> truthRoots = new HashSet<>();
        for (int person : truthPeople) {
            truthRoots.add(find(person));
        }

        int answer = 0;
        for (List<Integer> party : parties) {
            boolean canLie = true;
            for (int person : party) {
                if (truthRoots.contains(find(person))) {
                    canLie = false;
                    break;
                }
            }
            if (canLie) answer++;
        }

        System.out.println(answer);
    }

    static int find(int x) {
        if (x != parent[x]) parent[x] = find(parent[x]);
        return parent[x];
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) parent[rootB] = rootA;
    }
}
