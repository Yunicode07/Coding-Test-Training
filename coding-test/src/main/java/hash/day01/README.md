## 문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

### 제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

### 입출력 예)
| participant | completion | return |
|-------------|------------|--------|
| ["leo","kiki","eden"] | ["eden","kiki"] | "leo" |
| ["marina","josipa","nikola","vinko","filipa"] | ["josipa","filipa","marina","nikola"] | "vinko" |
| ["mislav","stanko","mislav","ana"] | ["stanko","ana","mislav"] | "mislav" |

### 입출력 예 설명

**예제 #1**
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

**예제 #2**
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

**예제 #3**
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

```
package hash.day01;

import java.util.HashMap;
import java.util.Map;

// 이중for문 돌려서 participant에서 completion 하나씩 제거 X => 동명이인 처리 불가능
// == 대신 equals
class Solution {
    public String solution(String[] participant, String[] completion) {
//      이름(String) → 등장 횟수(Integer) 를 저장하는 공간
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
//          getOrDefault : 키가 있으면 그 값, 없으면 기본값을 반환
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
//          해당 이름의 현재 카운트를 가져옴
            map.put(c, map.get(c) - 1);
        }

// 방법 1 시작]
//        map.keySet() : map에 들어있는 모든 이름(키) 목록
        for (String key : map.keySet()) {
//            map.get(key) > 0 : 해당 이름이 남아있는 인원 수 확인
            if (map.get(key) > 0) {
//                완주하지 못한 선수는 단 1명 찾는 즉시 반환
                return key;
            }
        }
// 방법 1 끝]

// 방법 2 시작] 장점 : 추가 조회 1번 줄임 + 의도 더 명확 + 패턴이 견고
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
// 방법 2 끝]

        return "";
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(s.solution(participant, completion));
    }
}
```