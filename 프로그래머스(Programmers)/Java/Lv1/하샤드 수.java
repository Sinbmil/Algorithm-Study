/*
 * 프로그래머스 Lv1 - 하샤드 수
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12947

 * 정확성 테스트 케이스 17개 중 17개 성공
 * 총점 100.0
*/

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int res = x;
        
        while(x>0){
            sum+=x%10; // x를 10으로 나눈 나머지 값을 sum에 더하기
            x = x/10;  // x를 10으로 나누기
        }
        
        boolean answer = (res%sum == 0)?true:false;
        // res(x값)를 sum으로 나누었을 때 나머지가 0이면 true 반환 아니면 false 반환
        return answer;
    }
}