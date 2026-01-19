package level0.day04;

class Solution2 {
    public int solution(int n) {
        // 최소공배수 피자 6조각 사람 n명이 동일한 조각수 먹기위함
        for(int i = 1; ; i++){
            if((6*i) % n == 0) {
                return i;
            }
        }
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int n = 4;

        System.out.println((s.solution(n)));
    }
}
