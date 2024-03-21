class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = -1, luy = 51, rdx = -1, rdy = -1;

        for (int i = 0; i < wallpaper.length; i++) {
            if (lux == -1 && wallpaper[i].contains("#")) {
                System.out.println("i : " + wallpaper[i].indexOf('#'));
                lux = i;
            }

            if (wallpaper[i].contains("#") && luy > wallpaper[i].indexOf('#')) {
                luy = wallpaper[i].indexOf('#');
            }

            if (wallpaper[i].contains("#")) {
                rdx = i+1;
            }

            if (wallpaper[i].contains("#") && rdy < wallpaper[i].lastIndexOf('#')+1) {
                rdy = wallpaper[i].lastIndexOf('#') + 1;
            }

        }

        return new int[] {lux, luy, rdx, rdy};
    }
}