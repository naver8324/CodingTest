import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	
	boolean check = true;

	for(int i=1; i<=5; i++){
		String list = br.readLine();
		if(list.contains("FBI")){
			sb.append(i).append(" ");
			check = false;
		}
	}
	
	if(check){
		sb.append("HE GOT AWAY!");
	}	

	System.out.println(sb.toString());
	br.close();
    }
}