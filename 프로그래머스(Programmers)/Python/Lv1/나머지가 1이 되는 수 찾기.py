# 프로그래머스 Lv1 - 나머지가 1이 되는 수 찾기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/87389

# 정확성 테스트 케이스 11개 중 11개 성공
# 총점 100.0

def solution(n):
    answer = 0
    for i in range(1,n+1): # 1부터 n까지
        if n%i == 1: # 나머지가 1이면 즉시 종료
            break
    answer = i
    return answer

n = 10
print (solution(n))
# 출력 결과: 3