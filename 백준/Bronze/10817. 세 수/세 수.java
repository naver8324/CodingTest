import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

        int result = 0;
        
        if(a>b){
            if(b>c) result = b;
            else {
                if(a>c) result = c;
                else result = a;
            }
        }else{
            if(b<c) result = b;
            else {
                if(a>c) result = a;
                else result = c;
            }
        }

        System.out.println(result);
    }
}
