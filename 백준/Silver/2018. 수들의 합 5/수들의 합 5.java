import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start_index = 1,  end_index = 1;
        int sum = 1;
        int count = 1;

        while(N != end_index){
            if (sum == N) {
                count++;
                end_index++;
                sum += end_index;
            }
            else if(sum > N){
                sum -= start_index;
                start_index++;
            }else{
                end_index++;
                sum += end_index;
            }
        }

        System.out.println(count);
    }
}