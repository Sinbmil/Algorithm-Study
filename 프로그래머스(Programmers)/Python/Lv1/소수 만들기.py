# 프로그래머스 Lv1 - 소수 만들기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12977

# 정확성 테스트 케이스 26개 중 26개 성공
# 총점 100.0

import itertools # 콤비네이션을 위한 라이브러리
import math # sqrt를 위한 라이브러리

def solution(nums):
    answer = 0
    sum_list=[]
    cnt = itertools.combinations(nums,3) 
    # nums에서 3개로 이루어진 조합 찾기

    for i in cnt: 
       sum_list.append(sum(i))
       # sum_list에 각 조합에 더한 값들을 넣어주기

    for j in sum_list: 
        if isprime(j):
            answer +=1
    # sum_list에서 isprime()을 적용해서 소수에 해당하면 answer를 1 더해주기

    return answer

def isprime(a):
    for k in range(2,int(math.sqrt(a)+1)): # 2부터 a의 제곱근까지
        if a%k == 0: 
            return False
    return True
     # 지정한 숫자가 k로 나누었을 때 0으로 떨어지지 않으면 소수

nums = [1,2,7,6,4]
print (solution(nums))
# 출력 결과: 4