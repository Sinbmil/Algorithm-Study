/*
 * 프로그래머스 Lv2 - 숫자의 표현
 * 문제링크:https://programmers.co.kr/learn/courses/30/lessons/12924

 * 정확성 테스트 케이스 18개 중 18개 성공
 * 총점 100.0
*/

class Solution {
    public int solution(int n) {
    	
    	int answer = 0;
    	for(int i=1; i<=n; i++){ // i부터 n까지
    		int sum = 0;
    		for(int j=i; j<=n; j++){
    			sum += j; // sum에 j를 더하기 
    			
    			if(sum==n) { // sum과 n이 같으면 answer +1 증가
    				answer++;
    				break;
    			}else if(sum>n) { // sum이 n보다 크면 break
    				break;
    			}
    		}
    	}
    	return answer;
    }
}