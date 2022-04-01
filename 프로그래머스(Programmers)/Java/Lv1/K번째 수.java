/*
 * 프로그래머스 Lv1 - K번째 수
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/42748

 * 정확성 테스트 케이스 7개 중 7개 성공
 * 총점 100.0
*/

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
         int[] answer = new int[commands.length]; 
         int n = 0;
		
         for(int i = 0; i<commands.length; i++) {
	  int[] slice = new int[commands[i][1] - commands[i][0]+1]; 
	  for (int j = 0; j < slice.length; j++) {
	         slice[j] = array[j + commands[i][0]-1];
	         // 이중 반복문으로 데이터르 잘라서 slice 배열에 넣어주기
	   }
	   Arrays.sort(slice); // 오름차순 정렬 
	   answer[i] = slice[commands[i][2]-1];  // K번째 수를 정답 배열에 넣음
           }
        return answer;
    }
}