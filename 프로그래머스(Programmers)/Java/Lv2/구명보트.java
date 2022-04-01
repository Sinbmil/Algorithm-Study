/*
 * 프로그래머스 Lv2 - 구명보트
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/42885

 * 정확성 테스트 케이스 15개 중 15개 성공
 * 효율성 테스트 케이스  5개 중  5개 성공
 * 총점 100.0
*/

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int idx = 0;
		
        Arrays.sort(people); // people 배열 정리하기
		
        for(int i = people.length-1; i>= idx; i--) {
            // 몸무게가 가장 무거운 사람부터
            if(people[i]+people[idx] <= limit) {
                idx++;
                answer++;
                // 최소 + 최대 몸무게가 limit보다 작거나 같을 때
                // idx랑 answer 증가
            }
            else { // 그렇지 않은 경우 answer만 증가하고 idx는 위치 그대로
                answer++;
            }
        }
        return answer;
    }
}