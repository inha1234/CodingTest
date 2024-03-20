class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 0;
        int curHealth = health;
        for(int i = 0; i < attacks.length; i++){
            if(curHealth<health){
                int healtime = attacks[i][0] - time -1;
                int heal = (healtime/bandage[0])*bandage[2]+healtime*bandage[1];
                if(curHealth+heal<=health){
                    curHealth += heal;
                } else{
                    curHealth = health;
                }
            }
            
            if(curHealth-attacks[i][1]<=0){
                return -1;
            } else{
                curHealth -= attacks[i][1];
                time = attacks[i][0];
            }
        }
        return curHealth;
    }
}