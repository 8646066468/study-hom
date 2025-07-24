class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1){
            return new int[]{-1};
        }
        //가장 작은수 찾기
        int min = arr[0];
        for(int i = 0; i<arr.length; i++ ){
              if (arr[i] < min) {
                min = arr[i];
            }
        }
        
         //배열길이가 1보다 클 때
        //가장 작은 수를 뺀 길이로 초기화
        int[] answer =new int[arr.length -1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index++] = arr[i];
            } 
        } 
         return answer;
    }
}