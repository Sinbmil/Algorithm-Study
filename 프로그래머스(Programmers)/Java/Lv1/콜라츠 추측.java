/*
 * 프로그래머스 Lv1 - 콜라츠 추측
 * 문제링크:https://programmers.co.kr/learn/courses/30/lessons/12943

 * 정확성 테스트 케이스 16개 중 16개 성공
 * 총점 100.0
*/

class Solution {
    public int solution(int n) {
       int answer = 0;
		
        do {
              if(n==1) // n이 1이면 종료 
	         break;
            
              ++answer; // answer 증가
            
	      if(n%2 == 0){ // n이 짝수면 2 나누기
	         n = n/2; 
	         continue;
	      }
	      else if(n%2 == 1) { // n이 홀수면 3곱하고 1더하기
	          n = n*3+1;
	          continue;
	      }
			
	      if(answer == 500) { // answer가 500이 되면 -1을 넣어주고 종료
	          answer = -1;
	          break;
	       }
	   }while(n != 1); // n이 1이 될 때까지
		
	return answer;
    }
}
