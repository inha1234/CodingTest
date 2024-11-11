import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            @Override
            public int compare(String file1, String file2){
                String[] parts1 = splitFile(file1);
                String[] parts2 = splitFile(file2);
            
                int headCompare = parts1[0].compareToIgnoreCase(parts2[0]);
                if(headCompare != 0){
                    return headCompare;
                }
            
                int num1 = Integer.parseInt(parts1[1]);
                int num2 = Integer.parseInt(parts2[1]);
                return Integer.compare(num1, num2);
            }
        });
        return files;
    }
    private String[] splitFile(String file){
        String head = "";
        String number = "";
        
        int i = 0;
        while(i < file.length() && !Character.isDigit(file.charAt(i))){
            head += file.charAt(i++);
        }
        while(i < file.length() && Character.isDigit(file.charAt(i))){
            number += file.charAt(i++);
        }
        
        return new String[]{head, number};
    }
}