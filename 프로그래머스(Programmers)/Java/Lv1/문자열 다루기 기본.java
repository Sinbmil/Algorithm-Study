/*
 * 프로그래머스 Lv1 - 문자열 다루기 기본
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12918

 * 정확성 테스트 케이스 16개 중 16개 성공
 * 총점 100.0
*/

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6)  // 문자열 s의 길이가 4혹은 6이면
        {
            for(int i =0; i<s.length(); i++)
            {
                char ch = s.charAt(i); 
                // charAt()을 통해 string형을 char형으로 바꿔주기
                
                if(ch<'0' || ch>'9'){
                    answer = false;
                    // ch가 0보다 작고 9보다 크면 숫자가 아니므로 false 리턴
                }
            }
            return answer;
        }
        else{ // 문자열의 s의 길이가 4혹은 6이 아니면 false 리턴
            answer = false;
            return answer;
        }
    }
}