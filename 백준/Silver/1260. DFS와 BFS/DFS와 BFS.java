import java.util.*;
import java.io.*;

class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] edge;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        edge = new ArrayList[N];

        for(int i = 0; i < N; i++){
            edge[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            edge[start].add(end);
            edge[end].add(start);
        }

        for(int i = 0; i < N; i++){
            Collections.sort(edge[i]);
        }

        DFS(V - 1);
        sb.append("\n");

        visited = new boolean[N];
        BFS(V - 1);

        System.out.println(sb.toString());
        br.close();
    }

    public static void DFS(int Node){
        sb.append(Node + 1).append(" ");
        visited[Node] = true;

        for(int i : edge[Node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

    public static void BFS(int Node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node] = true;

        while(!queue.isEmpty()){
            int output = queue.poll();
            sb.append(output + 1).append(" ");

            for(int i : edge[output]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
