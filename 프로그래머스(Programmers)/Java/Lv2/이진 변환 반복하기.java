/*
 * 프로그래머스 Lv2 - 이진 변환 반복하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 * 정확성 테스트 케이스 11개 중 11개 성공
 * 총점 100.0
*/

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
	    while(s.length() > 1) {
	      int cnt = 0;
	      for(int i=0; i<s.length(); i++) {
	        if(s.charAt(i) == '0') 
                answer[1]++;
	        else 
                cnt++;
	      }
	 
	      s = Integer.toBinaryString(cnt);
	      answer[0]++;
	    }
	 
	    return answer;
    }
}
