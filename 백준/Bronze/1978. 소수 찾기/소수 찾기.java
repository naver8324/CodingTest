import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int primeCount = 0;

        for(int i =0; i<N;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(isPrime(arr[i])){
                primeCount++;
            }
        }

        System.out.println(primeCount);
        sc.close();
    }

    private static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}