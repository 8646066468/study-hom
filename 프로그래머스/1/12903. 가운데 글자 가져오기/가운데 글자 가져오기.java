class Solution {
    public String solution(String s) {
        int  answer = s.length();
        int mid= answer/2;
        
        //짝수일때
        if(answer % 2==0){
            return s.substring(mid-1,mid+1);
        }else{
            return s.substring(mid,mid+1);//홀수 가운데 한글자만
        }
        
        
    }
}