package level0.day01;

class Solution2 {
    public int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();

        int num1 = 2;
        int num2 = 3;

        System.out.println(s.solution(num1, num2));
    }
}