package level0.day04;

class Solution4 {
    public double solution(int[] numbers) {
        double answer;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = (double) sum /numbers.length;
        return answer;

        // numbers 배열의 평균값을 구하되, 배열이 비어 있으면 0을 반환
        // return Arrays.stream(numbers).average().orElse(0);
        // Arrays.stream(int[]) → IntStream 생성
        // .average() → IntStream의 평균 계산 = 반환 타입: OptionalDouble
        // 배열이 비어 있으면 평균이 존재하지 않기 때문
        // OptionalDouble이 값이 있으면 → 그 값 없으면 → 0 반환
        // **주의** 빈 배열이면 NoSuchElementException 발생
        // 풀어쓰면 아래와 같아짐
        /*
            IntStream stream = Arrays.stream(numbers);
            OptionalDouble avg = stream.average();

            double result;
            if (avg.isPresent()) {
                result = avg.getAsDouble();
            } else {
                result = 0;
            }
        */
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println((s.solution(numbers)));
    }
}
