package level0.day05;

import java.util.Arrays;

class Solution1 {
    public int[] solution(int money) {
        int coffee = 5500;
        for (int i = 1; ; i++) {
            while (money < coffee*i ){
                int count = i - 1;
                int change = money-(coffee*count);
                return new int[] {count, change};
            }
        }
        // 굳이 for문을 돌리지 않아도 됨
        // return new int[] { money / 5500, money % 5500 };
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int money = 15000;

        System.out.println(Arrays.toString(s.solution(money)));
    }
}
