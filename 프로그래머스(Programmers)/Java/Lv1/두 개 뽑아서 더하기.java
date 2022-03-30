package programmers;
/*
 * 프로그래머스 Lv1 - 두 개 뽑아서 더하기
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/68644

 * 정확성 테스트 케이스 9개 중 9개 성공
 * 총점 100.0
*/

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
   
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                int sum = numbers[i] + numbers[j]; // 두 개의 수를 더해서 sum에 넣는다.
                if(list.indexOf(sum) <0) // 리스트에 sum이 들어있지 않으면
                    list.add(sum); // add를 통해 sum을 추가한다.
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i); // get을 통해서 리스트를 가져온다.
        }
        
        Arrays.sort(answer); // 정렬하기
        
        return answer;
        
    }
}