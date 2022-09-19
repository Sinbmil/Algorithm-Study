/*
 * 프로그래머스 Lv1 - 최소직사각형
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 정확성 테스트 케이스 20개 중 20개 성공
 * 총점 100.0
*/

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w=0;
        int max_h=0;
        for(int i=0;i<sizes.length;i++){
            int v=Math.max(sizes[i][0],sizes[i][1]);
            int h=Math.min(sizes[i][0],sizes[i][1]);
            max_w=Math.max(max_w,v);
            max_h=Math.max(max_h,h);
        }
        answer = max_w*max_h;
        return answer;
    }
}