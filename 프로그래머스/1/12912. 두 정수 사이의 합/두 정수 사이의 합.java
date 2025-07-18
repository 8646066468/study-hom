class Solution {
public long solution(int a, int b) {
    int start = Math.min(a, b);
    int end = Math.max(a, b);
    long sum = 0;
    for (int i = start; i <= end; i++) {
        sum += i;
    }
    return sum;
}
}