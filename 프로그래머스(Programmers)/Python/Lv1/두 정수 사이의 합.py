# 프로그래머스 Lv1 - 두 정수 사이의 합
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12912

# 정확성 테스트 케이스 16개 중 16개 성공
# 총점 100.0

def solution(a, b):
    answer = 0
    if a<b: # a<b일 경우
       answer = sum(range(a,b+1))
       # sum을 이용해서 a부터 b까지
    else: # b<a일 경우
        answer = sum(range(b,a+1))
        #sum을 이용해서 b부터 a까지
    return answer

a = 3
b = 5
print (solution(a,b))
# 출력 결과: 12