/*
 * 프로그래머스 Lv1 - 가운데 글자 가져오기
 * 문제링크:https://programmers.co.kr/learn/courses/30/lessons/12903

 * 정확성 테스트 케이스 16개 중 16개 성공
 * 총점 100.0
*/

class Solution {
    public String solution(String s) {
        String[] arr = s.split(""); // 문자열 s를 split을 통해 잘라주기 
        int num = arr.length; // arr의 길이를 num의 대입
        
        if(num%2 == 1) // 문자열의 길이가 홀수
            return (arr[(num-1)/2]);
        else // 문자열의 길이가 짝수
            return (arr[((num)/2)-1] + arr[(num)/2]);
    }
}