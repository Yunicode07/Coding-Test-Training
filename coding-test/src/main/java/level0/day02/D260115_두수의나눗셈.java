package level0.day02;

class Solution4 {
    public int solution(int num1, int num2) {
        return (int) ((double) num1/(double) num2 * 1000);
        // return  (int) (((double) num1/num2) * 1000);
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution4 s = new Solution4();

        int num1 = 7;
        int num2 = 3;

        System.out.println(s.solution(num1, num2));
    }
}
