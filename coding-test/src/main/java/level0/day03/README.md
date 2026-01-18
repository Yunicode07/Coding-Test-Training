[//]: # (2026년 01월 18일)

# 나머지 구하기

## 문제 설명
정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

### 제한사항
0 < num1 ≤ 100
0 < num2 ≤ 100

### 입출력 예
| num1 | num2 | result |
|------|------|--------|
| 3    | 2    | 1      |
| 10   | 5    | 0      |

### 입출력 예 설명

### 입출력 예 #1

num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.

### 입출력 예 #2

num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.

```java
package level0.day03;


class Solution1 {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int num1 = 3;
        int num2 = 2;

        System.out.println(s.solution(num1, num2));
    }
}
```

# 중앙값 구하기

## 문제 설명
중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

### 제한사항
array의 길이는 홀수입니다.
0 < array의 길이 < 100
-1,000 < array의 원소 < 1,000

### 입출력 예
| array              | result |
|--------------------|--------|
| [1, 2, 7, 10, 11]  | 7      |
| [9, -1, 0]         | 0      |

### 입출력 예 설명

### 입출력 예 #1

본문과 동일합니다.

### 입출력 예 #2

9, -1, 0을 오름차순 정렬하면 -1, 0, 9이고 가장 중앙에 위치하는 값은 0입니다.

```java
package level0.day03;

import java.util.Arrays;

class Solution2 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int[] arr = array;
        int len = arr.length;
        int mid =  len / 2;
        return arr[mid];

        /* 더 간단하게 풀수 있는 로직 shift연산
        Arrays.sort(array);
        return array[array.length >> 1];
        */
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 s = new Solution2();

        int[] array = {1, 2, 7, 10, 11};

        System.out.println(s.solution(array));
    }
}
```

# 최빈값 구하기

## 문제 설명
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

### 제한사항
0 < array의 길이 < 100
0 ≤ array의 원소 < 1000

### 입출력 예
| array              | result |
|--------------------|--------|
| [1, 2, 3, 3, 3, 4] | 3      |
| [1, 1, 2, 2]       | -1     |
| [1]                | 1      |

### 입출력 예 설명

### 입출력 예 #1

[1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.

### 입출력 예 #2

[1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.

### 입출력 예 #3

[1]에는 1만 있으므로 최빈값은 1입니다.

```java
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
        // {1=1, 2=1, 3=3, 4=1} 이와 같은 형태
        // getOrDefault(num, 0) ⇨ map에 num이 이미 있으면 횟수 가져옴 없으면 0
        /*
            num=1 → getOrDefault(1,0)=0 → put(1,1) → {1=1}
            num=2 → 0 → put(2,1) → {1=1,2=1}
            num=3 → 0 → put(3,1) → {1=1,2=1,3=1}
            num=3 → 1 → put(3,2) → {...,3=2}
            num=3 → 2 → put(3,3) → {...,3=3}
            num=4 → 0 → put(4,1) → {1=1,2=1,3=3,4=1} 
         */
        
        // 최빈값 찾기
        int maxCount = 0;
        int answer = -1;
        
        // entrySet()은 Map의 (key, value) 쌍을 그대로 줘서
        // key와 value를 한 번에 가져올 수 있음

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(array.length == 1){ // 배열 자체 길이가 1일경우
                return array[0];
            }
            
            // 더 많이 나온 숫자 발견
            if(value > maxCount) {
                maxCount = value;
                answer = key;
            } else if (value == maxCount) { // 최빈값 2개 이상
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
```

# 짝수는 싫어요

## 문제 설명
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항
1 ≤ n ≤ 100

### 입출력 예
| n | result                      |
|----|-----------------------------|
| 10 | [1, 3, 5, 7, 9]             |
| 15 | [1, 3, 5, 7, 9, 11, 13, 15] |

### 입출력 예 설명

### 입출력 #1

10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.

### 입출력 #2

15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.

```java
package level0.day03;

import java.util.Arrays;

class Solution4 {
    public int[] solution(int n) {
        // 홀수의 개수
        int count = (n +1) / 2;
        int idx = 0;
        // 홀수를 담을 배열
        int[] answer = new int[count];

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                // 1부터 n까지 순회하면서 조건(i가 홀수)을 만족하는 값을
                // answer 배열의 현재 인덱스(idx)에 저장
                answer[idx] = i;
                // 다음 홀수를 저장하기 위해 인덱스 1 증가
                idx++;
            }
        }
        return answer;

        /* Stream 문법
           return IntStream
                        .rangeClosed(0, n) // 0부터 n까지를 모두 포함한 숫자 스트림 생성
                        .filter(value -> value % 2 == 1) // 각 숫자(value)에 대해 조건을 검사해서 true인 것만 통과
                        .toArray(); // IntStream → int[] 배열로 변환
        */
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int n = 10;

        System.out.println(Arrays.toString(s.solution(n)));
    }
}
```
