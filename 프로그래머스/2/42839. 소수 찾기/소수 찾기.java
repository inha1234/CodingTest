import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> primes = new HashSet<>();
        generateNumbers("", numbers, primes);
        for(int i : primes){
            if(isPrime(i)){
                answer++;
            }
        }
        return answer;
    }
    
    private void generateNumbers(String current, String remaining, Set<Integer> primes){
        if(!current.isEmpty()){
            primes.add(Integer.parseInt(current));
        }
        for(int i = 0; i < remaining.length(); i++){
            generateNumbers(current + remaining.charAt(i),
                           remaining.substring(0, i) + remaining.substring(i+1),
                           primes);
        }
    }
    
    private boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}