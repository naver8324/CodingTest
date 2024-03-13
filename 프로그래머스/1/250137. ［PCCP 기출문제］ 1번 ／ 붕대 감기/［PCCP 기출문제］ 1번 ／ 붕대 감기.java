class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int consecutiveSuccess = 0; // 연속성공
        int attackTime = 0; // 공격시간

        for (int time = 1; time <= attacks[attacks.length-1][0]; time++) {

            if (time == attacks[attackTime][0]) {// 공격 시간일 때
                currentHealth -= attacks[attackTime][1];
                attackTime++;
                consecutiveSuccess = 0;

                if (currentHealth <= 0) { // 체력이 0 이하
                    return -1;
                }
            } else if (currentHealth == health) {
                consecutiveSuccess++;
                
                if (consecutiveSuccess == bandage[0]) {
                    consecutiveSuccess = 0;
                }

            } else if (health > currentHealth) { // 현재 체력이 최대 체력보다 낮을 때
                consecutiveSuccess++;

                if (currentHealth + bandage[1] > health) { // 추가 회복량이 최대 체력보다 크면 현재 체력을 최대 체력으로
                    currentHealth = health;
                } else {
                    currentHealth += bandage[1]; // 추가체력회복
                }

                if (consecutiveSuccess == bandage[0]) { // 시전시간 다 채웠을 시
                    consecutiveSuccess = 0;

                    if (currentHealth + bandage[2] > health) { // 추가 회복량이 최대 체력보다 크면 현재 체력을 최대 체력으로
                        currentHealth = health;
                    } else {
                        currentHealth += bandage[2]; // 추가체력회복
                    }
                }
            }
        }

        return currentHealth;
    }
}