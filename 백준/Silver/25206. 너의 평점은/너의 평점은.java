import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double totalCredit = 0.0;
        double weightedSum = 0.0;

		for(int i=0; i<20; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			double gradeToDouble = 0.0;

            if(grade.equals("P")){
                continue;
            }
			
			switch (grade) {
                case "A+": gradeToDouble = 4.5; break;
                case "A0": gradeToDouble = 4.0; break;
                case "B+": gradeToDouble = 3.5; break;
                case "B0": gradeToDouble = 3.0; break;
                case "C+": gradeToDouble = 2.5; break;
                case "C0": gradeToDouble = 2.0; break;
                case "D+": gradeToDouble = 1.5; break;
                case "D0": gradeToDouble = 1.0; break;
            }

            totalCredit += credit;
            weightedSum += credit * gradeToDouble;
				
		}

        System.out.printf("%.6f", weightedSum / totalCredit);
	}
}