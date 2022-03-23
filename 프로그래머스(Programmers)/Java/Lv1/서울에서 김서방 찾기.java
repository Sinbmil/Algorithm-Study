/*
 * 프로그래머스 Lv1 - 서울에서 김서방 찾기 
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12919

 * 정확성 테스트 케이스 14개 중 14개 성공
 * 총점 100.0
*/

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++){ // 0부터 seoul 배열의 길이까지
            if(seoul[i].equals("Kim"))
                // equals 메소드를 통해 "Kim"과 일치한다면
                answer += "김서방은 " + i + "에 있다";
            	   // 일치하는 인덱스 위치에 김서방이 있다고 알려준다.
        }
        return answer;
    }
}
