package level0.day05;

import java.util.Arrays;

class Solution3 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length -1 - i];
        }
        return answer;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println((Arrays.toString(s.solution(num_list))));
    }
}
