/*
 * 프로그래머스 Lv2 - 다음 큰 숫자
 * 문제링크:https://programmers.co.kr/learn/courses/30/lessons/12911

 * 정확성 테스트 케이스 14개 중 14개 성공
 * 효율성 테스트 케이스  6개 중  6개 성공
 * 총점 100.0
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_bit = Integer.bitCount(n); 
        // Integer.bitCount: 2진수로 변환 후 1의 개수 구하는 메소드

        int bit_cnt = 0; // 큰 수의 비트 수를 나타나는 변수
        
        while(true) {
		  n++; // n을 증가
		  bit_cnt = Integer.bitCount(n);
		  if(bit_cnt == n_bit) { // 1의 개수가 같으면 종료
			answer = n;
			break;
		  }
	           }
        return answer;
    }
}