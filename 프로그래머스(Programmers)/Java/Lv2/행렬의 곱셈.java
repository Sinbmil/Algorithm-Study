/*
 * 프로그래머스 Lv2 - 행렬의 곱셈
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12949
 * 정확성 테스트 케이스 16개 중 16개 성공
 * 총점 100.0
*/

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

          for(int i = 0 ; i < arr1.length ; ++i){
              for(int j = 0 ; j < arr2[0].length ; ++j){
                  for(int k = 0 ; k < arr1[0].length ; ++k) {
                      answer[i][j] += arr1[i][k] * arr2[k][j];
                  }
              }
          }

          return answer;
    }
}