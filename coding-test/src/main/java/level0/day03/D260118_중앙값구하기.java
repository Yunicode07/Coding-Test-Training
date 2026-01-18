package level0.day03;

import java.util.Arrays;

class Solution2 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int[] arr = array;
        int len = arr.length;
        int mid =  len / 2;
        return arr[mid];

        /* 더 간단하게 풀수 있는 로직 shift연산
            Arrays.sort(array);
            return array[array.length >> 1];
        */
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();

        int[] array = {1, 2, 7, 10, 11};

        System.out.println(s.solution(array));
    }
}
