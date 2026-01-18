package level0.day03;

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public int solution(int[] array) {
        // ArrayList 원소 빈도수 Map에 저장
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num :array) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        // 최빈값 찾기
        int maxCount = 0;
        int answer = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(array.length == 1){
                return array[0];
            }

            if(value > maxCount) {
                maxCount = value;
                answer = key;
            } else if (value == maxCount) {
                answer = -1;
            }
        }
        return answer;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution3 s = new Solution3();

        int[] array = {1, 2, 3, 3, 3, 4};

        System.out.println(s.solution(array));
    }
}
