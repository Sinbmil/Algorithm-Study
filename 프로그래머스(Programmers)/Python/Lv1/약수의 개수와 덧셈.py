# 프로그래머스 Lv1 - 약수의 개수와 덧셈
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/77884

# 정확성 테스트 케이스 7개 중 7개 성공
# 총점 100.0

import math # sqrt를 위한 라이브러리

def solution(left, right):
    answer = 0
    for i in range(left,right+1): # left부터 right까지
        cnt = 0 # 약수의 개수를 알려주는 변수
        for j in range(1,i+1): # 1부터 i까지
            if i%j ==0:  
                cnt += 1
                # i를 j로 나눈 나머지가 0이면 cnt 1 더하기

        if cnt % 2 == 0:		
            answer += i			
            # cnt가 짝수면 i를 answer에 더하기
        else:
            answer -= i			
            # cnt가 홀수면 i를 answer에서 빼기
    return answer

left = 13
right = 17
print (solution(left,right))
# 출력 결과: 43