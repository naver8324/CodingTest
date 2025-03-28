public class Main {
    public static void main(String[] args) {
        boolean[] selfNumber = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int dn = getDn(i);
            if (dn < 10001) {
                selfNumber[dn] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if (!selfNumber[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }

    private static int getDn(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
