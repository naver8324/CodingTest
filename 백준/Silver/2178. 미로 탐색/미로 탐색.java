import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<M; j++){
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        BFS(0,0);

        System.out.println(maze[N-1][M-1]);
        br.close();
    }

    public static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()){
            int now[] = queue.poll();
            for(int i=0; i<4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < N && ny < M){
                    if(maze[nx][ny] == 1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        maze[nx][ny] = maze[now[0]][now[1]] + 1;
                        queue.add(new int[] {nx, ny});
                    }   
                }
            }
        }
    }
}
