package level0.day03;


class Solution1 {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int num1 = 3;
        int num2 = 2;

        System.out.println(s.solution(num1, num2));
    }
}
