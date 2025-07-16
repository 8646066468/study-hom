import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] strArr = Long.toString(n).split(""); 
        Arrays.sort(strArr, Collections.reverseOrder());  

        StringBuilder sb = new StringBuilder();
        for (String digit : strArr) {
            sb.append(digit);  
        }

        return Long.parseLong(sb.toString());  
    }
}