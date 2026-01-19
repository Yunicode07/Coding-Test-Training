package level0.day04;


class Solution1 {
    public int solution(int n) {
//        if(n%7 == 0) {
//            return n/7;
//        }else {
//            return n/7 + 1;
//        }
        return (n%7 == 0) ? n/7 : n/7 +1;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int n = 15;

        System.out.println((s.solution(n)));
    }
}
