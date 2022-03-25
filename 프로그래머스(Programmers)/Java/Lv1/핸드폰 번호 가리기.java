/*
 * 프로그래머스 Lv1 - 핸드폰 번호 가리기
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12948

 * 정확성 테스트 케이스 13개 중 13개 성공
 * 총점 100.0
*/

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split("");
        // split을 사용해서 phone_number를 하나씩 잘라서 arr 문자열 배열에 넣어주기
        
        for(int i=0; i<arr.length; i++){
            if(i<arr.length-4)
                answer+= "*";
                // i<arr.length-4인 경우 answer에 "*"을 추가
            else
                answer+=arr[i];
                // 맨 뒷 자리 4자리는 각 숫자를 answer에 추가
        }
        return answer;
    }
}