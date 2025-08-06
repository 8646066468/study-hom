import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String [] result = s.split("");
        Arrays.sort(result, Collections.reverseOrder());
         StringBuilder bu = new StringBuilder();
        for(String a : result){
            
                bu.append(a);
            }
        return bu.toString();
    }
}