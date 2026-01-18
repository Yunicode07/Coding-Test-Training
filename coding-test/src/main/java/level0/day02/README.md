[//]: # (2026년 01월 15일)
# 두 수의 합 구하기
## 문제 설명
정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.

### 제한사항
-50,000 ≤ num1 ≤ 50,000
-50,000 ≤ num2 ≤ 50,000

### 입출력 예
| num1 | num2 | result |
|------|------|--------|
| 2    | 3    | 5      |
| 100  | 2    | 102    |

### 입출력 예 설명

**입출력 예 #1**

num1이 2이고 num2가 3이므로 2 + 3 = 5를 return합니다.

**입출력 예 #2**

num1이 100이고 num2가 2이므로 100 + 2 = 102를 return합니다.


```java
package level0.day02;

class Solution1 {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int num1 = 2;
        int num2 = 3;

        System.out.println(s.solution(num1, num2));
    }
}
```

# 두 수의 곱 구하기

## 문제 설명
정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

### 제한사항
0 ≤ num1 ≤ 100
0 ≤ num2 ≤ 100

### 입출력 예
| num1 | num2 | result |
|------|------|--------|
| 3    | 4    | 12     |
| 27   | 19   | 513    |

### 입출력 예 설명

**입출력 예 #1**

num1이 3, num2가 4이므로 3 * 4 = 12를 return합니다.

**입출력 예 #2**

num1이 27, num2가 19이므로 27 * 19 = 513을 return합니다.

```java
package level0.day02;

class Solution2 {
    public int solution(int num1, int num2) {
        return num1 * num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();

        int num1 = 3;
        int num2 = 4;

        System.out.println(s.solution(num1, num2));
    }
}

```

# 몫 구하기

## 문제 설명
정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

### 제한사항
0 < num1 ≤ 100
0 < num2 ≤ 100

### 입출력 예
| num1 | num2 | result |
|------|------|--------|
| 10   | 5    | 2      |
| 7    | 2    | 3      |

### 입출력 예 설명

**입출력 예 #1**

num1이 10, num2가 5이므로 10을 5로 나눈 몫 2를 return 합니다.

**입출력 예 #2**

num1이 7, num2가 2이므로 7을 2로 나눈 몫 3을 return 합니다.

```java
package level0.day02;

class Solution3 {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution3 s = new Solution3();

        int num1 = 7;
        int num2 = 2;

        System.out.println(s.solution(num1, num2));
    }
}
```

# 두 수의 나눗셈

## 문제 설명
정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.

### 제한사항
0 < num1 ≤ 100
0 < num2 ≤ 100

### 입출력 예
| num1	 | num2 | result |
|-------|------|--------|
| 3     | 2    | 1500   |
| 7     | 3    | 2333   |
| 1     | 16   | 62     |

### 입출력 예 설명

**입출력 예 #1**

num1이 3, num2가 2이므로 3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.

**입출력 예 #2**

num1이 7, num2가 3이므로 7 / 3 = 2.33333...에 1,000을 곱하면 2333.3333.... 이 되며, 정수 부분은 2333입니다.

**입출력 예 #3**

num1이 1, num2가 16이므로 1 / 16 = 0.0625에 1,000을 곱하면 62.5가 되며, 정수 부분은 62입니다.

```java
package level0.day02;

class Solution4 {
    public int solution(int num1, int num2) {
        return (int) ((double) num1/(double) num2 * 1000);
        // return  (int) (((double) num1/num2) * 1000);
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution4 s = new Solution4();

        int num1 = 7;
        int num2 = 3;

        System.out.println(s.solution(num1, num2));
    }
}
```

# 분수의 덧셈

## 문제 설명
첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

### 제한사항
0 <numer1, denom1, numer2, denom2 < 1,000

### 입출력 예
| numer1 | denom1  | numer2  | denom2 | result  |
|--------|---------|---------|--------|---------|
| 1      | 2       | 3       | 4      | [5, 4]  |
| 9      | 2       | 1       | 3      | [29, 6] |

### 입출력 예 설명

**입출력 예 #1**

1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.

**입출력 예 #2**

9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.

```java
package level0.day02;

import java.util.Arrays;

class Solution5 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1 * denom2 + numer2 * denom1;
        int den = denom1 * denom2;

        // 최대 공약수로 나누기
        int divisor = gcd(num, den);
        num /= divisor;
        den /= divisor;

        return new int[]{ num, den };
    }

    // 최대 공약수 (GCD) 구하는 메서드 (유클리드 호제법)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution5 s = new Solution5();

        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;

        System.out.println(Arrays.toString(s.solution(numer1, denom1, numer2, denom2)));
    }
}
```

# 배열 두배 만들기

## 문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항
-10,000 ≤ numbers의 원소 ≤ 10,000
1 ≤ numbers의 길이 ≤ 1,000

### 입출력 예
| numbers                   | result                     |
|---------------------------|----------------------------|
| [1, 2, 3, 4, 5]           | [2, 4, 6, 8, 10]           |
| [1, 2, 100, -99, 1, 2, 3] | [2, 4, 200, -198, 2, 4, 6] |

### 입출력 예 설명

**입출력 예 #1**

[1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.

**입출력 예 #2**

[1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.

```java
package level0.day02;

import java.util.Arrays;

class Solution6 {
    public int[] solution(int[] numbers) {
        Arrays.setAll(numbers, i -> numbers[i] *2);
        return numbers;
        /*
            int[] arr = numbers;
            // 배열의 각 요소에 값을 할당하는 메서드
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
```