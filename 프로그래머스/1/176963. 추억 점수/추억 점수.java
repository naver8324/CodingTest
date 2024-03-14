import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> nameYearningMap = new HashMap<>();

        // 이름과 갈망도를 매핑
        for (int i = 0; i < name.length; i++) {
            nameYearningMap.put(name[i], yearning[i]);
        }

        // 각 사진별로 그리움 점수 계산
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (nameYearningMap.containsKey(photo[i][j])) {
                    // 그리움 점수 더하기
                    answer[i] += nameYearningMap.get(photo[i][j]);
                }
            }
        }
        return answer;
    }
}