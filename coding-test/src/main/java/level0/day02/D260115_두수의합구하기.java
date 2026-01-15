package level0.day02;

class Solution1 {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int num1 = 2;
        int num2 = 3;

        System.out.println(s.solution(num1, num2));
    }
}
