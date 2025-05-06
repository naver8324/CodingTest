import java.util.*;
import java.io.*;

public class Main {
    static int[] minCosts;
    static ArrayList<Bus>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        minCosts = new int[N + 1];
        Arrays.fill(minCosts, Integer.MAX_VALUE);

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startCity = Integer.parseInt(st.nextToken());
            int endCity = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph[startCity].add(new Bus(endCity, cost));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int startCity = Integer.parseInt(st.nextToken());
        int endCity = Integer.parseInt(st.nextToken());

        getMinCost(startCity, endCity);
        System.out.println(minCosts[endCity]);
    }

    private static void getMinCost(int start, int end) {
        PriorityQueue<Bus> pq = new PriorityQueue<>(Comparator.comparingInt(b -> b.cost));
        pq.offer(new Bus(start, 0));
        minCosts[start] = 0;

        while (!pq.isEmpty()) {
            Bus current = pq.poll();

            if (minCosts[current.city] < current.cost) {
                continue;
            }

            for (Bus next : graph[current.city]) {
                if (minCosts[next.city] > minCosts[current.city] + next.cost) {
                    minCosts[next.city] = minCosts[current.city] + next.cost;
                    pq.offer(new Bus(next.city, minCosts[next.city]));
                }
            }
        }
    }
}

class Bus {
    int city;
    int cost;

    Bus(int city, int cost) {
        this.city = city;
        this.cost = cost;
    }
}