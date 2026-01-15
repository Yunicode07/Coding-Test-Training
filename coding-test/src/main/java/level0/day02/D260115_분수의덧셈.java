package level0.day02;

import java.util.Arrays;

class Solution5 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1 * denom2 + numer2 * denom1;
        int den = denom1 * denom2;

        // 최대 공약수로 나누기
        int divisor = gcd(num, den);
        num /= divisor;
        den /= divisor;

        return new int[]{ num, den };
    }

    // 최대 공약수 (GCD) 구하는 메서드 (유클리드 호제법)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution5 s = new Solution5();

        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;

        System.out.println(Arrays.toString(s.solution(numer1, denom1, numer2, denom2)));
    }
}