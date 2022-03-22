/*
 * 프로그래머스 Lv1 - 2016년
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12901

 * 정확성 테스트 케이스 14개 중 14개 성공
 * 총점 100.0
*/

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        // week: 각 요일들을 초기화한 배열 
        // 2016년 1월 1일은 금요일이라서 2번째 인덱스에 임의적으로 위치
       
        int[] endDay = {31,29,31,30,31,30,31,31,30,31,30,31};
        // endDay: 1~12월의 마지막 일을 초기화 
        // 2016년은 윤년이기에 2월은 29일로 초기화
        
        int res = 0;
        for(int i = 0; i<a-1; i++) // 0부터 a-1월까지 
            res+=endDay[i]; // res에 각 마지막 일수를 더하기
        
        res+=b; // res에 b일을 더하기
        
        answer = week[(res%7)]; 
        // res를 7로 나누었을 때의 나머지 값의 week 인덱스 값을 answer에 대입
        
        return answer;
    }
}
