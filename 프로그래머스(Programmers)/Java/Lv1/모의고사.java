/*
 * 프로그래머스 Lv1 - 모의고사
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/42840

 * 정확성 테스트 케이스 14개 중 14개 성공
 * 총점 100.0
*/

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
	
        int[] first = {1,2,3,4,5}; // 1번 수포자가 찍는 방식
        int[] second = {2,1,2,3,2,4,2,5}; // 2번 수포자가 찍는 방식
        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 3번 수포자가 찍는 방식
		
        int[] scores = {0,0,0};
        int[] answer = {};
		
        for(int i=0; i<answers.length; i++){
             if(first[i%5] == answers[i]){scores[0]++;}  // 1번 수포자는 5번씩 반복
	     if(second[i%8] == answers[i]){scores[1]++;} // 2번 수포자는 8번씩 반복
	     if(third[i%10] == answers[i]){scores[2]++;} // 3번 수포자는 10번씩 반복
        }
		
        int max = 0; // max값 구하기
        for(int i=0; i<3; i++) {
	if(scores[i]>max)
	    max = scores[i];
         }
		
         if(max == scores[0])list.add(1); // max값이랑 같으면 넣는다.
         if(max == scores[1])list.add(2);
         if(max == scores[2])list.add(3);
		
         answer = new int[list.size()];
		
         for(int i =0; i<answer.length; i++) {
	     answer[i] = list.get(i);
         }
        
        return answer;
    }
}
