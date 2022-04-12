# 프로그래머스 Lv2 - 최소값 만들기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12941

# 정확성 테스트 케이스 16개 중 16개 성공
# 효율성 테스트 케이스  4개 중  4개 성공
# 총점 100.0

def solution(A,B):
    answer = 0
    n = len(A) # A의 길이를 n에 대입
    A.sort() # A를 오름차순으로 정렬
    B.sort(reverse = True) # B를 내림차순으로 정렬
    for i in range(n):
        answer += A[i]*B[i] #A와 B의 i원소들의 곱한 값을 answer에 더하기
    return answer

A = [1,4,2]
B = [5,4,4]

print (solution(A,B))
# 출력 결과: 29

