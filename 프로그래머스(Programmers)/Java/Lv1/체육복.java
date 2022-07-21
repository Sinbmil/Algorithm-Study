/*
 * 프로그래머스 Lv1 - 체육복
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/42862

 * 정확성 테스트 케이스 20개 중 20개 성공
 * 총점 100.0
*/

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
	
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
 	    // 여벌의 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
            	// 자기 자신이 포함되는지 체크
                if(lost[i] == reserve[j]){
                    answer++; // 자신의 옷을 입으므로 answer 증가
                    lost[i] = -1;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
            	// 잃어버린 사람의 앞 뒤 번호만 빌려줄 수 있음
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        return answer;
    }
}