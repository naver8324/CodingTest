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

                currentHealth = Math.min(health, currentHealth + bandage[1]);

                if (consecutiveSuccess == bandage[0]) { // 시전시간 다 채웠을 시
                    consecutiveSuccess = 0;
                    currentHealth = Math.min(health, currentHealth + bandage[2]);
                }
            }
        }

        return currentHealth;
    }
}