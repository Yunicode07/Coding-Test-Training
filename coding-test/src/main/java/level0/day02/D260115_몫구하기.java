package level0.day02;

class Solution3 {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution3 s = new Solution3();

        int num1 = 7;
        int num2 = 2;

        System.out.println(s.solution(num1, num2));
    }
}
