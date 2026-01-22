package level0.day05;


class Solution4 {
    public String solution(String my_string) {
        // StringBuilder : 문자열을 내부에서 직접 수정할 수 있는 객체
        // 대표적 메서드
        /*
            sb.append(" world");   // 뒤에 추가
            sb.insert(0, "Hi ");   // 앞에 삽입
            sb.delete(0, 3);       // 삭제
            sb.reverse();          // 뒤집기
            sb.setCharAt(0, 'H');  // 문자 변경
        */
        StringBuilder answer = new StringBuilder();
        for (int i = my_string.length()-1; i >= 0; i--) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();

        // StringBuilder 제대로 사용하며 짧게 표현하면
        // return new StringBuilder(myString).reverse().toString();
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        String my_string = "jaron";

        System.out.println((s.solution(my_string)));
    }
}
