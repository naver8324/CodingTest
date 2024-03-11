class Solution {
    public int solution(String[][] board, int h, int w) {
        int boardLength = board.length;
        int answer = 0;
        
        int dh[] = {0, 1, -1, 0};
        int dw[] = {1, 0, 0, -1};
        
        if(h == 0){
            dh = new int[]{0, 1, 0};  
            dw = new int[]{1, 0, -1};
        }
        
        if(w ==  0){
            dh = new int[]{0, 1, -1};
            dw = new int[]{1, 0, 0};
        }
        
        String boardValue = board[h][w];
        
        for(int i = 0; i < dh.length; i++){
            int newH = h + dh[i]; // 0  1  0
            int newW = w + dw[i]; // 2  1  0
            if(newH >= 0 && newH < boardLength && newW >= 0 && newW < boardLength && boardValue.equals(board[newH][newW])){
                answer++;
            }
        }
        
        return answer;
    }
}
