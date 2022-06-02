/*
 * 프로그래머스 Lv2 - 124 나라의 숫자
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12899
 * 정확성 테스트 케이스 14개 중 14개 성공
 * 효율성 테스트 케이스  6개 중  6개 성공
 * 총점 100.0
*/

class Solution {
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";
        while(n>0) {
    	answer = numbers[n%3] + answer;   // 3으로 나눈 나머지에 answer을 연결
    	n=(n-1)/3;                                   // n은 1을 빼고 3으로 나눠주기 
        }
        return answer;
    }
}