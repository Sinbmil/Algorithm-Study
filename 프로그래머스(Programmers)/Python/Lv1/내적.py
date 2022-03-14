# 프로그래머스 Lv1 - 내적
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/70128

# 정확성 테스트 케이스 9개 중 9개 성공
# 총점 100.0

def solution(a,b):
    answer = 0
    n = len(a) # 리스트의 길이 a를 n에 대입
    for i in range(n): # i부터 n까지
        answer += a[i]*b[i]  
        #a와 b의 i원소들의 곱한 값을 answer에 더하기
    return answer

a = [1,2,3,4]
b = [-3,-1,0,2]

print (solution(a,b))
# 출력 결과: 3