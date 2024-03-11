import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> filteredData = new ArrayList<>();

        for (int[] datum : data) {
            if (ext.equals("code") && datum[0] < val_ext) {
                filteredData.add(datum);
            }
            else if (ext.equals("date") && datum[1] < val_ext) {
                filteredData.add(datum);
            }
            else if (ext.equals("maximum") && datum[2] < val_ext) {
                filteredData.add(datum);
            }
            else if (ext.equals("remain") && datum[3] < val_ext) {
                filteredData.add(datum);
            }
        }

        // 정렬
        filteredData.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (sort_by.equals("code")) {
                    return a[0] - b[0];
                }
                else if (sort_by.equals("date")) {
                    return a[1] - b[1];
                }
                else if (sort_by.equals("maximum")) {
                    return a[2] - b[2];
                }
                else {
                    return a[3] - b[3];
                }
            }
        });

        // List를 배열로 변환
        int[][] answer = new int[filteredData.size()][];
        for (int i = 0; i < filteredData.size(); i++) {
            answer[i] = filteredData.get(i);
        }

        return answer;
    }
}