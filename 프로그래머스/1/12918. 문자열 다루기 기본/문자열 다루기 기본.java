public class Solution {
    public boolean solution(String s) {
        // 문자열의 길이가 4 혹은 6인지 확인
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        // 숫자인지 확인하는 try-catch 블록
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}