import java.util.*;
public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();

        // 1. 나누어 떨어지는 값만 리스트에 추가
        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }

        // 2. 나누어 떨어지는 값이 하나도 없으면 [-1] 반환
        if (result.isEmpty()) {
            return new int[]{-1};
        }

        // 3. 오름차순 정렬
        Collections.sort(result);

        // 4. 리스트를 배열로 변환하여 반환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}