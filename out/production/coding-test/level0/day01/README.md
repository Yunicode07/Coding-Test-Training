[//]: # (2026년 01월 14일)
# 두 수의 차 구하기
## 문제 설명
정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

### 제한사항
-50000 ≤ num1 ≤ 50000
-50000 ≤ num2 ≤ 50000

### 입출력 예
| num1 | num2 | result |
|------|------|--------|
| 2    | 3    | -1     |
| 100  | 2    | 98     |

### 입출력 예 설명

**입출력 예 #1**

num1이 2이고 num2가 3이므로 2 - 3 = -1을 return합니다.

**입출력 예 #2**

num1이 100이고 num2가 2이므로 100 - 2 = 98을 return합니다.


```
package level0.day01;

class Solution {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        level0.day01.Solution s = new level0.day01.Solution();

        int num1 = 2;
        int num2 = 3;

        System.out.println(s.solution(num1, num2));
    }
}
```

# 숫자 비교하기

## 문제 설명
정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

### 제한사항
0 ≤ num1 ≤ 10,000
0 ≤ num2 ≤ 10,000

### 입출력 예)
| num1 | num2 | result |
|------|------|--------|
| 2    | 3    | -1     |
| 11   | 11   | 1      |
| 7    | 99   | -1     |

### 입출력 예 설명

**입출력 예 설명 #1**

num1이 2이고 num2가 3이므로 다릅니다. 따라서 -1을 return합니다.

**입출력 예 설명 #2**

num1이 11이고 num2가 11이므로 같습니다. 따라서 1을 return합니다.

**입출력 예 설명 #3**

num1이 7이고 num2가 99이므로 다릅니다. 따라서 -1을 return합니다.

```
package level0.day01;

class Solution {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        level0.day01.Solution s = new level0.day01.Solution();

        int num1 = 2;
        int num2 = 3;

        System.out.println(s.solution(num1, num2));
    }
}
```