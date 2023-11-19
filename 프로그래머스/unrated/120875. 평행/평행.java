class Solution {
    public int solution(int[][] dots) {
        for(int i = 0; i<3; i++){
            for(int j = i+1; j<4; j++){
                for(int k = 0; k<3; k++){
                    for(int l = k+1; l<4; l++){
                        if(k != i && k != j && l != i && l != j){
                            double num1 = 0;
                            double num2 = 0;
                            double tmp1 = 0;
                            double tmp2 = 0;
                            double a = 0;
                            double b = 0;
                            if(dots[i][0]==dots[j][0]){
                                num1 = Double.MAX_VALUE;
                            } else{
                                tmp1 = dots[i][1]-dots[j][1];
                                tmp2 = dots[i][0]-dots[j][0];
                                a = tmp1;
                                b = tmp2;
                            //     while(b!=0){
                            //         int c = b;
                            //         b = a%b;
                            //         a = c;
                            //     }
                            //     tmp1 /= a;
                            //     tmp2 /= a;
                                num1 = tmp1/tmp2;
                            }
                            
                            if(dots[k][0]==dots[l][0]){
                                num2 = Double.MAX_VALUE;
                            } else{
                                tmp1 = dots[k][1]-dots[l][1];
                                tmp2 = dots[k][0]-dots[l][0];
                                
                                a = tmp1;
                                b = tmp2;
//                                 while(b!=0){
//                                     int c = b;
//                                     b = a%b;
//                                     a = c;
//                                 }
//                                 tmp1 /= a;
//                                 tmp2 /= a;
                                
                                num2 = tmp1/tmp2;
                            }
                            
                            if(num1==num2){
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}