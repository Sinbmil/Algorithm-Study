# 프로그래머스 Lv1 - 정수 제곱근 판별
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12934

# 정확성 테스트 케이스 18개 중 18개 성공
# 총점 100.0

from math import * # 파이썬 수학 라이브러리

def solution(n):
    answer = 0
    res = sqrt(n)
    if res%1 == 0: 
    # sqrt 함수를 적용한 값이 1로 나눈 나머지가 0이면 제곱근으로 판단
        answer = int(pow(res+1,2)) 
        #제곱근이므로 res+1의 제곱해준값 리턴
    else:
        answer = -1 
        # 제곱근이 아니면 -1 리턴
    return answer

n = 121
print (solution(n))
# 출력 결과: 144