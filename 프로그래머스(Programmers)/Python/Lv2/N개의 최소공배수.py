# 프로그래머스 Lv2 - N개의 최소공배수
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12953

# 정확성 테스트 케이스 10개 중 10개 성공
# 총점 100.0

import math # 수학 라이브러리

def solution(arr):
    answer = arr[0]
    for i in arr: # arr의 처음부터 끝까지
        answer = (i*answer) // math.gcd(i,answer)
        # 최소공배수: a*b // gcd(a,b)
        # gcd는 최대공약수
    return answer

arr = [2,6,8,14]
print (solution(arr))
# 출력 결과: 168