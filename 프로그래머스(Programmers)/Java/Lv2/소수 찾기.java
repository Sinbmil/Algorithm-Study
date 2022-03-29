/*
 * 프로그래머스 Lv1 - 소수 찾기
 * 문제링크:https://programmers.co.kr/learn/courses/30/lessons/12921

 * 정확성 테스트 케이스 12개 중 12개 성공
 * 효율성 테스트 케이스  4개 중  4개 성공
 * 총점 100.0
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++){ // i는 2부터 n까지
            boolean flag = true;
            
            for(int j=2; j<=Math.sqrt(i); j++){ // j는 2부터 i의 제곱근까지
                if(i%j == 0){ // i%j==0이 참이면 소수 아님
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                answer++;
        }
        return answer;
    }
}