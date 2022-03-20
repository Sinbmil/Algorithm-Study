/*
 * 프로그래머스 Lv1 - 수박수박수박수박수박수
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12922

 * 정확성 테스트 케이스 14개 중 14개 성공
 * 총점 100.0
*/

class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++) {// i는 1부터 n까지
            if(i%2==0)
                answer+="박";
                // i가 짝수면 "박"을 더해주기
            else
                answer+="수";
                // i가 홀수면 "수"를 더해주기
        }
        return answer;
    }
}
