import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] pokemonByIndex = new String[N + 1];
        Map<String, Integer> pokemonByName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokemonByIndex[i] = name;
            pokemonByName.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                int index = Integer.parseInt(query);
                sb.append(pokemonByIndex[index]);
            } else {
                sb.append(pokemonByName.get(query));
            }
            sb.append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}
