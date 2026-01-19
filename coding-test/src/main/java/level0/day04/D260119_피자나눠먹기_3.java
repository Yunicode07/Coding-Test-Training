package level0.day04;

class Solution3 {
    public int solution(int slice, int n) {
        for(int i = 1; ; i++) {
            if(slice * i >= n) {
                return i;
            }
        }
        // 더 간단한 풀이법) 나눗셈은 기본이 내림이라서 n + slice - 1 해줌
        // return (n + slice -1) / slice;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int slice = 4;
        int n = 12;

        System.out.println((s.solution(slice, n)));
    }
}