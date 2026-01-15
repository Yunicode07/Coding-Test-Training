package level0.day02;

class Solution2 {
    public int solution(int num1, int num2) {
        return num1 * num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();

        int num1 = 3;
        int num2 = 4;

        System.out.println(s.solution(num1, num2));
    }
}
