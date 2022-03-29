/*
 * 프로그래머스 Lv2 - 멀쩡한 사각형
 * 문제링크:https://programmers.co.kr/learn/courses/30/lessons/62048

 * 정확성 테스트 케이스 18개 중 18개 성공
 * 총점 100.0
*/

class Solution {
     public long solution(int w, int h) {
        long answer= 0;
        long w1 = (long)w; // long형으로 변환
        long h1 = (long)h; // long형으로 변환
        
	answer = (w1*h1) - (w1+h1-gcd(w1,h1));
	// 사용할 수 있는 칸 = (너비*높이) - (너비+높이-최대공약수(너비,높이)
	return answer;
       }
    
     public static long gcd(long w, long h) { // 최대 공약수
	long i=0;
	long max = Math.max(w, h); // 최대값 정하기
	long min = Math.min(w, h); // 최소값 정하기
		
	for(i=min; i>=0; i--) {
		if((w%i==0)&&(h%i ==0)) { 
			break;
		// w%i==0과 h%i==0이 참일 때 가장 먼저 해당되면 최대 공약수 
		}
	}
	return i;
   }
}
