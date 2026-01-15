package level0.day02;

import java.util.Arrays;

class Solution6 {
    public int[] solution(int[] numbers) {
        Arrays.setAll(numbers, i -> numbers[i] *2);
        return numbers;
        /*
            int[] arr = numbers;
            Arrays.setAll(arr, i -> numbers[i] *2);
            return arr;
        */

        /* 굳이 import 하지 않고 for문으로 깔끔한 로직
            for(int i=0; i<numbers.length; i++) numbers[i] *=2;
            return numbers;
        */
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution6 s = new Solution6();

        int[] numbers = {1, 2, 100, -99, 1, 2, 3};

        System.out.println(Arrays.toString(s.solution(numbers)));
    }
}
