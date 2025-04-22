import java.util.*;

public class Main {
    static int[] board = new int[101];
    static boolean[] visited = new boolean[101];

    static class Node {
        int position;
        int moves;

        Node(int position, int moves) {
            this.position = position;
            this.moves = moves;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            board[i] = i;
        }

        for (int i = 0; i < N; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            board[from] = to;
        }

        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            board[from] = to;
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(1, 0));
        visited[1] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.position == 100) {
                return current.moves;
            }

            for (int dice = 1; dice <= 6; dice++) {
                int nextPos = current.position + dice;
                if (nextPos > 100) continue;

                int finalPos = board[nextPos];
                if (!visited[finalPos]) {
                    visited[finalPos] = true;
                    queue.add(new Node(finalPos, current.moves + 1));
                }
            }
        }

        return -1;
    }
}
