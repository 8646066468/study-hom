class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m);           // 최대공약수
        int lcm = (n * m) / gcd;          // 최소공배수
        return new int[]{gcd, lcm};
    }

    // 유클리드 호제법으로 GCD 구하기
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}