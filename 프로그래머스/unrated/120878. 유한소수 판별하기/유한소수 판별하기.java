class Solution {
    public int solution(int a, int b) {
        int tmpA = a;
        int tmpB = b;
        int tmp = 0;
        while(tmpB!=0){
            tmp = tmpB;
            tmpB = tmpA%tmpB;
            tmpA = tmp;
        }
        int gcd = tmpA;
        b /= gcd;
        
        while(b%2==0){
            b/=2;
        }
        while(b%5==0){
            b/=5;
        }
        
        if(b==1){
            return 1;
        } else{
            return 2;
        }
    }
}