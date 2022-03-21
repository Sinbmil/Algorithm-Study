/*
 * 프로그래머스 Lv1 - 문자열 내 p와 y의 개수
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12916

 * 정확성 테스트 케이스 30개 중 30개 성공
 * 총점 100.0
*/

class Solution {
	boolean solution(String s) {
	        boolean answer = true;
	        char[] str = s.toCharArray();
	        // toCharArray()를 통해 문자열을 char형 배열로 바꿔주기
	        int pcount = 0; // p의 개수를 나타내는 변수
	        int ycount = 0; // y의 개수를 나타내는 변수
	        
	        for(int i=0; i<str.length; i++) // 0부터 str의 길이까지
	        {
	            if(str[i]=='p' || str[i]=='P')
	                pcount++;
	            // 배열의 원소가 p 또는 P일경우 pcount 증가
	            else if(str[i]=='y' || str[i] == 'Y')
	                ycount++;
	            // 배열의 원소가 y 또는 Y일경우 ycount 증가
	        }
	        
	        if(pcount == ycount)
	            return answer;
	        	// pcount와 ycount가 같을시 true 리턴
	        else
	            return !answer;
	        	// pcount와 ycount가 다를시 false 리턴
    }
}
