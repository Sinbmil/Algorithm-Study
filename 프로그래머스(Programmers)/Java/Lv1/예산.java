/*
 * 프로그래머스 Lv1 - 예산
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12982
 * 정확성 테스트 케이스 23개 중 23개 성공
 * 총점 100.0
*/

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            budget -= d[i];
            if(budget <0)
                break;
            answer++;
        }
        return answer;
    }
}