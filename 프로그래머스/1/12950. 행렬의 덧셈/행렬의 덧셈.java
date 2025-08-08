class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        
        int[][] answer= new int [rows][cols];
        for(int i =0; i<rows; i++)
            for(int j=0; j<cols; j++) 
                answer[i][j] = arr1[i][j]+arr2[i][j];
        return answer;
    }
}