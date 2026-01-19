[//]: # (2026년 01월 19일)

# 피자 나눠 먹기 (1)

## 문제 설명
머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

### 제한사항
1 ≤ n ≤ 100

### 입출력 예
| n  | result |
|----|--------|
| 7  | 1      |
| 1  | 1      |
| 15 | 3      |
	
### 입출력 예 설명

### 입출력 예 #1

7명이 최소 한 조각씩 먹기 위해서 최소 1판이 필요합니다.

### 입출력 예 #2

1명은 최소 한 조각을 먹기 위해 1판이 필요합니다.

### 입출력 예 #3

15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.

```java
package level0.day04;


class Solution1 {
    public int solution(int n) {
//        if(n%7 == 0) {
//            return n/7;
//        }else {
//            return n/7 + 1;
//        }
        return (n%7 == 0) ? n/7 : n/7 +1;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int n = 15;

        System.out.println((s.solution(n)));
    }
}
```

# 피자 나눠 먹기 (2)

## 문제 설명
머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

### 제한사항
1 ≤ n ≤ 100

### 입출력 예
| n  | result |
|----|--------|
| 6  | 1      |
| 10 | 5      |
| 4  | 2      |

### 입출력 예 설명

### 입출력 예 #1

6명이 모두 같은 양을 먹기 위해 한 판을 시켜야 피자가 6조각으로 모두 한 조각씩 먹을 수 있습니다.

### 입출력 예 #2

10명이 모두 같은 양을 먹기 위해 최소 5판을 시켜야 피자가 30조각으로 모두 세 조각씩 먹을 수 있습니다.

### 입출력 예 #3

4명이 모두 같은 양을 먹기 위해 최소 2판을 시키면 피자가 12조각으로 모두 세 조각씩 먹을 수 있습니다.

```java
package level0.day04;

class Solution2 {
    public int solution(int n) {
        // 최소공배수 피자 6조각 사람 n명이 동일한 조각수 먹기위함
        for(int i = 1; ; i++){
            if((6*i) % n == 0) {
                return i;
            }
        }
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int n = 4;

        System.out.println((s.solution(n)));
    }
}
```

# 피자 나눠 먹기 (3)

## 문제 설명
머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

### 제한사항
2 ≤ slice ≤ 10
1 ≤ n ≤ 100

### 입출력 예
| slice | n  | result |
|-------|----|--------|
| 7     | 10 | 2      |
| 4     | 12 | 3      |

### 입출력 예 설명

### 입출력 예 #1

10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.

### 입출력 예 #2

12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.

```java
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
```

# 배열의 평균값

## 문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

### 제한사항
0 ≤ numbers의 원소 ≤ 1,000
1 ≤ numbers의 길이 ≤ 100
정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

### 입출력 예
| numbers                                      | result |
|----------------------------------------------|--------|
| [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]              | 5.5    |
| [89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99] | 94.0   |

### 입출력 예 설명

### 입출력 예 #1

numbers의 원소들의 평균 값은 5.5입니다.

### 입출력 예 #2

numbers의 원소들의 평균 값은 94.0입니다.

```java
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
```

# 옷가게 할인 받기

## 문제 설명
머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.

### 제한사항
10 ≤ price ≤ 1,000,000
price는 10원 단위로(1의 자리가 0) 주어집니다.
소수점 이하를 버린 정수를 return합니다.

### 입출력 예
| price   | result  |
|---------|---------|
| 150,000 | 142,500 |
| 580,000 | 464,000 |

### 입출력 예 설명

### 입출력 예 #1

150,000원에서 5%를 할인한 142,500원을 return 합니다.

### 입출력 예 #2

580,000원에서 20%를 할인한 464,000원을 return 합니다.

```java
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
```