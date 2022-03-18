# 프로그래머스 Lv1 - 최대공약수와 최소공배수
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12940

# 정확성 테스트 케이스 16개 중 16개 성공
# 총점 100.0

import math
def solution(n, m):
    answer = []
    # 최대공약수
    for i in range(min(n,m),0,-1): 
    # n과 m중 최소값부터 0까지 역순으로
        if n%i ==0 and m%i==0:
        # n%i ==0과 m%i ==0이 참이면
            answer.append(i)
            #answer 리스트에 i를 넣어주기
            break

    # 최소공배수
    for i in range(max(n,m),n*m+1):
    # n과 m중 최대값부터 n*m까지    
        if i%n == 0 and i%m == 0:
        # i%n ==0과 i%m ==0이 참이면
            answer.append(i)
            #answer 리스트에 i를 넣어주기
            break
    return answer

n = 2
m = 5
print (solution(n,m))
# 출력 결과: [1,10]