import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder str = new StringBuilder();
        
        for(char c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                str.append(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)){
                str.append(Character.toUpperCase(c));
            }
        }
        System.out.println(str.toString());
    }
}