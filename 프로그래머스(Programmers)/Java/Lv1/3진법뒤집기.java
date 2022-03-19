/*
 * 프로그래머스 Lv1 - 3진법 뒤집기
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/68935
 * 
 * 정확성 테스트 케이스 10개 중 10개 성공
 * 총점 100.0
 */

class Solution {
    public int solution(int n) {
      	int answer = 0;
		String ans = "";
		
		while(n!=0) { 
		    // n이 0일때 까지 반복
			ans += n%3; 
			// n을 3으로 나누었을 때 나머지를 ans에 더해주기
			n = n/3;
			// n은 다시 3으로 나눠주기
		}
		
		return Integer.parseInt(ans,3);
		// Integer.parseInt를 통해서 ans 3진법을 10진법으로 리턴
    }
}
