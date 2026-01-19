package level0.day04;

class Solution5 {
    public int solution(int price) {
        if (price >= 500000){
            return (int) (price * 0.8);
        } else if (price >= 300000 && price < 500000) {
            return (int) (price * 0.9);
        } else if (price >= 100000) {
            return (int) (price * 0.95);
        } else{
            return price;
        }
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        int price = 150000;

        System.out.println((s.solution(price)));
    }
}
