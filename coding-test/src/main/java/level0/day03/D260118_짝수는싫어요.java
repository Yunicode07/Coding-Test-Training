package level0.day03;

import java.util.Arrays;

class Solution4 {
    public int[] solution(int n) {
        // 홀수의 개수
        int count = (n +1) / 2;
        int idx = 0;
        // 홀수를 담을 배열
        int[] answer = new int[count];

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                // 1부터 n까지 순회하면서 조건(i가 홀수)을 만족하는 값을
                // answer 배열의 현재 인덱스(idx)에 저장
                answer[idx] = i;
                // 다음 홀수를 저장하기 위해 인덱스 1 증가
                idx++;
            }
        }
        return answer;

        /* Stream 문법
           return IntStream
                        .rangeClosed(0, n) // 0부터 n까지를 모두 포함한 숫자 스트림 생성
                        .filter(value -> value % 2 == 1) // 각 숫자(value)에 대해 조건을 검사해서 true인 것만 통과
                        .toArray(); // IntStream → int[] 배열로 변환
        */
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int n = 10;

        System.out.println(Arrays.toString(s.solution(n)));
    }
}
