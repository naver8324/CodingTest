import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());

        if(dice1 == dice2 && dice1 == dice3){
            System.out.println(10000 + (dice1 * 1000));
            return;
        }else if(dice1 == dice2 || dice1 == dice3){
            System.out.println(1000 + (dice1 * 100));
            return;
        }else if(dice2 == dice3){
            System.out.println(1000 + (dice2 * 100));
            return;
        }else{
            int max = Math.max(dice1, dice2);
            max = Math.max(max, dice3);
            System.out.println(max * 100);
        }
        
        br.close();
    }
}