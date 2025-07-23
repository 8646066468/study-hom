class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();//총길이
        
        String s = "*".repeat(length - 4);
        String last4 = phone_number.substring(length-4);
        String answer = s+last4;
        
        return answer;
        
    }
}