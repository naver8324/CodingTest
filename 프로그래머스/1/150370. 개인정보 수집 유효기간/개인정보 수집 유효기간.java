import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        // 오늘 날짜를 숫자 배열로 변환
        int[] todayInt = Arrays.stream(today.split("\\."))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 약관 별 유효기간을 저장하는 Map
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] termSplit = term.split(" ");
            termsMap.put(termSplit[0], Integer.parseInt(termSplit[1]));
        }

        // 개인정보 수집 일자의 유효기간을 미리 계산하여 저장
        int[][] privaciesInfo = new int[privacies.length][3];
        for (int i = 0; i < privacies.length; i++) {
            String[] privacySplit = privacies[i].split(" ");
            int[] privacyDate = Arrays.stream(privacySplit[0].split("\\."))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            privaciesInfo[i] = getExpirationDate(privacyDate, termsMap.get(privacySplit[1]));
        }

        // 오늘 날짜와 개인정보 수집 일자의 유효기간 비교하여 파기 여부 결정
        for (int i = 0; i < privaciesInfo.length; i++) {
            int[] expirationDate = privaciesInfo[i];
            if (compareDates(todayInt, expirationDate) >= 0) {
                answer.add(i + 1);
            }
        }

        // List를 배열로 변환하여 반환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 개인정보 수집 일자에 유효기간을 더한 날짜 계산
    private int[] getExpirationDate(int[] privacyDate, int term) {
        privacyDate[1] += term;
        while (privacyDate[1] > 12) {
            privacyDate[0]++;
            privacyDate[1] -= 12;
        }
        return privacyDate;
    }

    // 날짜 비교 (첫 번째 날짜가 두 번째 날짜보다 이후면 양수, 이전이면 음수, 같으면 0)
    private int compareDates(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] != date2[i]) {
                return date1[i] - date2[i];
            }
        }
        return 0;
    }
}