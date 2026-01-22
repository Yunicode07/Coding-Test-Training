package level0.day05;


class Solution2 {
    public int solution(int age) {
        int year = 2022;
        return year - age + 1;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int age = 40;

        System.out.println((s.solution(age)));
    }
}
