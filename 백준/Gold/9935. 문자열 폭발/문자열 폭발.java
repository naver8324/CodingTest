import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String bomb = br.readLine();

        int bombLen = bomb.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));

            if (sb.length() >= bombLen) {
                boolean flag = true;
                for (int j = 0; j < bombLen; j++) {
                    if (sb.charAt(sb.length() - bombLen + j) != bomb.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sb.delete(sb.length() - bombLen, sb.length());
                }
            }
        }

        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.toString());
        }
    }
}
