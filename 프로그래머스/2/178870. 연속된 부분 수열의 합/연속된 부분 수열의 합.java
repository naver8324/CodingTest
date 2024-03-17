import java.util.Arrays;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;
        int sum = 0;

        for (int endIndex = 0; endIndex < sequence.length; endIndex++) {
            sum += sequence[endIndex];
            while (sum > k) {
                sum -= sequence[startIndex];
                startIndex++;
            }
            if (sum == k && (endIndex - startIndex) + 1 < minLength) {
                answer = new int[]{startIndex, endIndex};
                minLength = (endIndex - startIndex) + 1;
            }
        }
        return answer;
    }
}
