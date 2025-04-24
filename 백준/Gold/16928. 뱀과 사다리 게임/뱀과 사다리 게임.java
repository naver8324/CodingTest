import java.util.*;
import java.io.*;

public class Main {
    static int[] board;
    static boolean[] visited = new boolean[101];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new int[101];

        for (int i = 1; i <= 100; i++) {
            board[i] = i;
        }

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            board[from] = to;
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            board[from] = to;
        }

        System.out.println(bfs());


    }

    private static int bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(1, 0));
        visited[1] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.position == 100) {
                return current.moveCount;
            }

            for (int dice = 1; dice <= 6; dice++) {
                int next = current.position + dice;

                if (next > 100) {
                    continue;
                }

                int nextPosition = board[next];

                if (!visited[nextPosition]) {
                    visited[nextPosition] = true;
                    queue.offer(new Node(nextPosition, current.moveCount + 1));
                }
            }
        }

        return -1;
    }
}

class Node{
    int position;
    int moveCount;

    Node(int position, int moveCount) {
        this.position = position;
        this.moveCount = moveCount;
    }
}