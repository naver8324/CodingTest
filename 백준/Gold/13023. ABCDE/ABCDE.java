import java.io.*;
import java.util.*;

class Main{
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int check;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N];
        visited = new boolean[N];
        check = 0;

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);
        }

        for (int i = 0; i < N; i++) {
            if (check == 1) {
                break;
            }
            DFS(i, 1);
        }

        System.out.print(check);
    }

    private static void DFS(int i, int depth) {
        if (depth >= 5) {
            check = 1;
            return;
        }

        visited[i] = true;

        for (int n : A[i]) {
            if (!visited[n]) {
                DFS(n, depth + 1);
            }
        }

        visited[i] = false;
    }
}