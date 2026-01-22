[//]: # (2026년 01월 19일)

# 아이스 아메리카노

## 문제 설명
머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

### 제한사항
0 < money ≤ 1,000,000

### 입출력 예
| money  | result    |
|--------|-----------|
| 5,500  | [1, 0]    |
| 15,000 | [2, 4000] |

### 입출력 예 설명

### 입출력 예 #1

5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.

### 입출력 예 #2

15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.

```java
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
```

# 나이 출력

## 문제 설명
머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요

### 제한사항
0 < age ≤ 120
나이는 태어난 연도에 1살이며 매년 1월 1일마다 1살씩 증가합니다.

### 입출력 예
| age | result |
|-----|--------|
| 40  | 1983   |
| 23  | 2000   |

### 입출력 예 설명

### 입출력 예 #1

2022년 기준 40살이므로 1983년생입니다.

### 입출력 예 #2

2022년 기준 23살이므로 2000년생입니다.

```java
package level0.day05;


class Solution2 {
    public int solution(int age) {
        int year = 2022;
        return year - age + 1;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int age = 40;

        System.out.println((s.solution(age)));
    }
}
```

# 배열 뒤집기

## 문제 설명
정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항
1 ≤ num_list의 길이 ≤ 1,000
0 ≤ num_list의 원소 ≤ 1,000

### 입출력 예
| num_list              | 	result               |
|-----------------------|-----------------------|
| [1, 2, 3, 4, 5]       | [5, 4, 3, 2, 1]       |
| [1, 1, 1, 1, 1, 2]    | [2, 1, 1, 1, 1, 1]    |
| [1, 0, 1, 1, 1, 3, 5] | [5, 3, 1, 1, 1, 0, 1] |

### 입출력 예 설명

### 입출력 예 #1

num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.

### 입출력 예 #2

num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.

### 입출력 예 #3

num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.

```java
package level0.day05;

import java.util.Arrays;

class Solution3 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length -1 - i];
        }
        return answer;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println((Arrays.toString(s.solution(num_list))));
    }
}
```

# 뒤집힌 문자열

## 문제 설명
문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

### 제한사항
1 ≤ my_string의 길이 ≤ 1,000

### 입출력 예
| my_string | return  |
|-----------|---------|
| "jaron"   | "noraj" |
| "bread"   | "daerb" |

### 입출력 예 설명

### 입출력 예 #1

my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.

### 입출력 예 #2

my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.

```java
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
```