class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int minimun_rank=7;
        int max_rank;
        int num_0=0;
        
        for(int i=0;i<win_nums.length;i++){
            for(int j=0;j<win_nums.length;j++){
                if(win_nums[i]==lottos[j]){ //당첨번호와 일치할때
                    minimun_rank-=1;
                   }
            }
            if(lottos[i]==0){ //0(모르는번호) 개수 확인
                num_0+=1;
            }
        }
        if(minimun_rank==7){
            minimun_rank=6;
        }
        max_rank = minimun_rank-num_0;
        if(num_0==6){
            max_rank=1;
        }
        int[] answer = {max_rank, minimun_rank};
        return answer;
    }
}