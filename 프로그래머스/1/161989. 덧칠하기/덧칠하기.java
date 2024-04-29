class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedBlock = 0;

        for (int j : section) {
            if (paintedBlock < j) {
                paintedBlock = j + m - 1;
                answer++;
            }
        }

        return answer;
    }
}
