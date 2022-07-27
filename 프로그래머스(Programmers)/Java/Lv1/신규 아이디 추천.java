package programmers;
/*
 * 프로그래머스 Lv1 - 신규 아이디 추천
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/72410

 * 정확성 테스트 케이스 26개 중 26개 성공
 * 총점 100.0
*/

class Solution {
    public String solution(String new_id) {
    	
        String answer = "";
     
        // 1단계 - 대문자들 소문자로 치환
		new_id = new_id.toLowerCase();
	
		// 2단계 - 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
		new_id = new_id.replaceAll("[^a-z0-9-_.]","");
		
		// 3단계 - 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
		new_id = new_id.toString().replace("..", ".");
        while (new_id.contains("..")) {
        	new_id = new_id.replace("..", ".");
        }
        
        // 4단계 - 마침표(.)가 처음일 때 제거
        if (new_id.length() > 0) {
            if (new_id.charAt(0) == '.') {
                new_id = new_id.substring(1, new_id.length());
            }
        }

        // 4단계 - 마침표(.)가 끝일 때 제거
        if (new_id.length() > 0) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        
        // 5단계 - 빈 문자열이라면, new_id에 "a"를 대입
        if (new_id.length() == 0) {
            new_id = "a";
        }
        
        // 6단계 - new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
     
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        // 6단계 - 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        
        // 7단계 - new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 추가
        if (new_id.length() <= 2) {
            for (int i = new_id.length(); i < 3; i++) {
                new_id = new_id += new_id.charAt(new_id.length() - 1);
            }
        }
        return new_id;
    }
}